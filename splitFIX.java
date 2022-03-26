// Trying to translate a fix protocol into code using a parse/split methid
// Error in line 10, says "variable declaration not allowed here"

public class splitFIX {
	public static void main(String args[]){
  	String str = "8=FIX4.2|9=0132|35=D|57=ADMIN|34=2|49=TESTA|56=TESTB|52=20100315-13:45:28|55=BARC|40=2|38=1000|21=2|11=OrderNumber0|60=2010031517:45:20|54=1|44=110.5|10=9";
    String[] arrOfStr = str.split("|",17);
    
    for (String a : arrOfStr)
      String[] output = a.split("=", 2);
      if(output[0]=="8")
      {
      	System.out.print("BeginString=");
      	System.out.println(output[1]);
      }
      if(output[0]=="9")
      {
      	System.out.print("BodyLength=");
      	System.out.println(output[1]);
      }
      if(output[0]=="35")
      {
      	System.out.print("MsgType=");
      	System.out.println(output[1]);
      }
      if(output[0]=="57")
      {
      	System.out.print("TargetSubID=");
      	System.out.println(output[1]);
      }
      if(output[0]=="34")
      {
      	System.out.print("MsgSeqNum=");
      	System.out.println(output[1]);
      }
      if(output[0]=="49")
      {
      	System.out.print("SenderCompID=");
      	System.out.println(output[1]);
      }
      if(output[0]=="56")
      {
      	System.out.print("TargetCompID=");
      	System.out.println(output[1]);
      }
      if(output[0]=="52")
      {
      	System.out.print("SendingTime=");
      	System.out.println(output[1]);
      }
      if(output[0]=="55")
      {
      	System.out.print("Symbol=");
      	System.out.println(output[1]);
      }
      if(output[0]=="40")
      {
      	System.out.print("OrdType=");
      	System.out.println(output[1]);
      }
      if(output[0]=="38")
      {
      	System.out.print("OrderQty=");
      	System.out.println(output[1]);
      }
      if(output[0]=="21")
      {
      	System.out.print("HandlInst=");
      	System.out.println(output[1]);
      }
      if(output[0]=="11")
      {
      	System.out.print("CIOrdID=");
      	System.out.println(output[1]);
      }
      if(output[0]=="60")
      {
      	System.out.print("TransactTime=");
      	System.out.println(output[1]);
      }
      if(output[0]=="54")
      {
      	System.out.print("Side=");
      	System.out.println(output[1]);
      }
      if(output[0]=="44")
      {
      	System.out.print("Price=");
      	System.out.println(output[1]);
      }
      if(output[0]=="10")
      {
      	System.out.print("CheckSum=");
      	System.out.println(output[1]);
      }
      
    	//System.out.println(a);
  }
}
