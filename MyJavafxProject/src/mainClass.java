import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Scanner;
public class mainClass
{
	static double d;
	static BigDecimal bd;
	static String  customerActivity="customer.txt";
	static String cline=null;
	static Scanner scan= new Scanner(System.in);
	static PrintWriter printToCustomerFile =mainClass.createTextWrite(customerActivity);
	static int lineNumber=0;
	
	public static void main(String []args)
	{
		java.util.Date date = new java.util.Date();
		System.out.println("date: "+date);
		printToCustomerFile.println(lineNumber+" date: "+ date);
		lineNumber++;
		int customerNumber=(int)(Math.random()*2)+2;
		System.out.println("customer "+customerNumber+" will be buying");
		printToCustomerFile.println(lineNumber+" customer "+customerNumber+" will be buying");
		lineNumber++;
		if(customerNumber==1||customerNumber==2||customerNumber==3)
		{
			printToCustomerFile.println(lineNumber+" You are going to use");
			lineNumber++;
			System.out.println("You are going to use");
			int vendingMachineNumber=(int)(Math.random()*2)+1;
			printToCustomerFile.println(lineNumber+" vending machine "+vendingMachineNumber);
			lineNumber++;
			System.out.println("vending machine "+vendingMachineNumber);		
			if(vendingMachineNumber==1)
			{
				VendingMachine1 V1= new VendingMachine1();
				V1.VendingMachine();
			}
			else if(vendingMachineNumber==2)
			{
				SecondVendingMachine V2= new SecondVendingMachine();
				V2.SecVendingMachine();
			}
		}
	}
	public static double round(double value, int places)
	{
		if (places < 0) throw new IllegalArgumentException();
		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
	public static PrintWriter createTextWrite(String S)
	{
		PrintWriter TStream = null;
		try
		{
			TStream = new PrintWriter(new FileOutputStream(S));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file in createTextWrite "+S.toString());
			System.exit(0);
		}
		return TStream;
	}
	/*private static void method() {
		d=(double)(Math.random()*2)+2.00;
		System.out.println(d);
		bd = new BigDecimal(d);
	    bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
	    System.out.println(bd);
	    System.out.println("how much money do you have with you?");
		setbd(bd);
		System.out.println(getbd());		
	}
	public static BigDecimal getbd() {
		return bd;
	}

	public static void setbd(BigDecimal bd) {
		bd = bd;
	}*/
}