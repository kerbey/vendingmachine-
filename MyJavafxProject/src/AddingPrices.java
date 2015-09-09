import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddingPrices
{
	static String recieptFile="receiptFile.txt",line=null;
	static PrintWriter textStreamForCustomerReceipt = AddingPrices.createTextWrite(recieptFile);
	static int count=0;
	String answer="", receipt="";int choices;
	double prices;
	static double purchases = 0;	
	static int arraysize=2, amountOfItems=0;
	public static String[] listOfItemPurchased= new String[arraysize];
	Scanner input= new Scanner(System.in);
	public double method(double moneyAvailableTobuy)
	{
		String choices=input.next();
		if (choices!=null)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" What is the price?");
			mainClass.lineNumber++;
			System.out.println("what is the price?");
			prices=input.nextDouble();
			purchases=purchases+prices;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/prices)+" bag of "+choices+" chips= $" + prices);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/prices)+" bag of "+choices+" chips= $" + prices);
			line=listOfItemPurchased[amountOfItems]="$"+prices+" = "+choices;
		}
		mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought "+choices+" for: $"+ purchases);
		mainClass.lineNumber++;
		System.out.println(" you bought "+choices+" for: $"+ purchases);
	    System.out.println("this is from the arrayList in the addingPricesClass: "+listOfItemPurchased[amountOfItems]);
		//System.out.println("count"+count+"line"+line);
		textStreamForCustomerReceipt.println(count+" "+line);
		count++;
		//System.out.println("amountOfItems "+amountOfItems);
		//System.out.println("arraysize "+arraysize);
		arraysize++;
		amountOfItems++;
		return purchases;
	}	
	public static void printReciept()
	{
		int listLength=listOfItemPurchased.length;
		int i=0;
		if (i<listLength)
		{
			textStreamForCustomerReceipt.println(count+" "+listOfItemPurchased[i]);
			count++;
			System.out.println(listOfItemPurchased[i]);
			i++;
		}
			textStreamForCustomerReceipt.println(count+" Customer Receipt: ");
		    count++;
		    textStreamForCustomerReceipt.println(count+" subtotal =$"+purchases);
			count++;
			textStreamForCustomerReceipt.println(count+" tax      =$"+(listLength*1.26));
			count++;
			textStreamForCustomerReceipt.println(count+" total    =$"+(purchases+(listLength*1.26)));
			textStreamForCustomerReceipt.close();
			System.out.println("Customer Receipt");
			System.out.println("\n subtotal= $"+purchases);
			System.out.println("tax=      $"+(listLength*1.26));
			System.out.println("total=    $"+(purchases+(listLength*1.26)));
			//i++;
		
		Scanner scanFile = AddingPrices.createTextRead(recieptFile);// scan a file
		for (count = 1; count <= arraysize; count++)
		{
			count = scanFile.nextInt();
			line = scanFile.nextLine();
			System.out.println(count + line);
		}
		scanFile.close();
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
	public static Scanner  createTextRead(String S)
	{
		Scanner textFile = null;
		try
		{
			textFile = new Scanner(new FileInputStream(new File(S)));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found "+S.toString());
			System.out.println("or could not be opened."+S.toString());
		}
		return textFile;
	}
}