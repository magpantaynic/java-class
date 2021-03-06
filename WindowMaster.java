//Window Master Exercise
import java.util.Scanner;


public class windowMaster {
	
	public static void main(String[] args)
	{

		// declare string variables for height & width
		String height;
		String width;

		//declare variables in float
		float heightF;
		float widthF;
		float perimeter;
		float cost;
		float area;
		float windowPrice = 0.f;
		float trimPrice = 0.f;

		//declare variable that will make the program count how many windows are there
		int numOfWindows = 0;


		//Since we'll be getting a user's input, declare & initialize a scanner
		Scanner myScanner = new Scanner(System.in);

		//Ask for user's input
		do { 

			try{


				System.out.println("Please enter window's height: ");
				height = myScanner.nextLine();
				height = Float.parseFloat(height);

				System.out.println("Please enter window's width: ");
				width = myScanner.nextLine();
				width = Float.parseFloat(width);

				System.out.println("Please enter window's price: ");
				windowPrice = Float.parseFloat(myScanner.nextLine());
				
				System.out.println("Please enter window's trim price : ");
				trimPrice = Float.parseFloat(myScanner.nextLine());

				System.out.println("How many windows are there? : ");
				numOfWindows = Integer.parseInt(myScanner.nextLine());

				validInput = true;

			} catch(NumberFormatException ex) {
				System.out.println("Your input was not a valid number.")
				validInput = false;


			}

		} while (!validInput)


		//Calculate Area
		area = height * width;

		//Calculate Perimeter
		perimeter = 2 * (height + width);

		//Calculate total Cost
		//Use a hard-coded value for material cost
		cost = ((windowPrice * area)) + ((trimPrice * perimeter)) * numOfWindows;

		//Display results to the user
		System.out.println("Window height = " + height);
		System.out.println("Window width = " + width);
		System.out.println("Window area = " + area);
		System.out.println("Window perimeter = " + perimeter);
		System.out.println("Total cost = " + cost);

	}


}
