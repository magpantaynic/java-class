/*

@authors: Spencer Nikolaeff & Nicole Magpantay

*/

import java.util.Scanner;

public class Factorizer {

      public static void main(String[] args)
      {
        Scanner input = new Scanner(System.in);
        System.out.print("What number would you like to factor?");
        int choice = Integer.parseInt(input.nextLine());
        factor(choice);

      }

      public static void factor(int num)
      {

          int num_factors = 1;
          int perfect = 0;
          int loop_size = num/2 + 1;
          System.out.println("The factors of " + num + " are: ");
          for(int i=1; i < loop_size; i++)
          {
                if(num % i == 0)
                {
                  num_factors++;
                  perfect += i;
                  System.out.print(i + " ");
                }
           }
          System.out.println(num);
          System.out.println(num + " has " + num_factors + " factors.");
          if(perfect == num || num == 1)
          {
             System.out.println(num + " is a perfect number.");
          } else {
            System.out.println(num + " is not a perfect number.");
          }
          if(num_factors == 2)
          {
            System.out.println(num + " is a prime number."); 
          } else {
            System.out.println(num + " is not a prime number.");
          }

       }  
}
