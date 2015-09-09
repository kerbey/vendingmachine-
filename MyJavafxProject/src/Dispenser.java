import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Dispenser
{
	Scanner input = new Scanner(System.in);
	private double moneyAvailableTobuy, moneySpent;
	String item, answer = "";
	AddingPrices a= new AddingPrices();

	public void dispensers()
	{
		VendingMachine1.machineSwitch();
		try
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" how much money do you have with you?");
			mainClass.lineNumber++;
			System.out.println("how much money do you have with you?");
			/*double m= mainClass.round(((double)(Math.random()*2)+2.00), 2);
			System.out.println(m);*/
			setMoneyAvailableTobuy(input.nextDouble());		
		} 
		catch (Exception e)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Invalid please try again");
			mainClass.lineNumber++;
			System.out.println("Invalid please try again");
			Dispenser d = new Dispenser();
			d.dispensers();
		}
		
		do {
			VendingMachine1.machineSwitch();
			for (int food=1;food<=2;food++)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" choose your two items");
				mainClass.lineNumber++;
				System.out.println("choose your two items");
				setMoneySpent(a.method(getMoneyAvailableTobuy()));

				System.out.println("getmoneyavailabletobuy="+getMoneyAvailableTobuy());
				System.out.println("getMoneyspent= "+getMoneySpent());

				if((getMoneyAvailableTobuy()>getMoneySpent()))
				{
					double m= mainClass.round(getMoneyAvailableTobuy()-getMoneySpent(), 2);
					System.out.println(m);
					setMoneyAvailableTobuy(m);
				}
				else if (getMoneySpent()<getMoneyAvailableTobuy())
				{
					double m= mainClass.round(getMoneySpent()-getMoneyAvailableTobuy(), 2);
					System.out.println(m);
					setMoneyAvailableTobuy(m);
				}
				else
				{
					setMoneyAvailableTobuy(0);
					AddingPrices.printReciept();
					end();
				}
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+"you have  that much money left: "
					+ (getMoneyAvailableTobuy()) + "\nAre you finished?");
			mainClass.lineNumber++;
			System.out.println("you have  that much money left: "
					+ (getMoneyAvailableTobuy()) + "\nAre you finished?");
			answer=mainClass.scan.nextLine();
		}while (answer.equals("no"));	
	}
	public void end()
	{
		if (getMoneyAvailableTobuy()<=0)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" the amount you have left is: $"
					+ (getMoneyAvailableTobuy())
					+ "Sorry you dont have any money left to use!!");
			mainClass.lineNumber++;
			System.out.println("the amount you have left is: $"
					+ (getMoneyAvailableTobuy()));
			System.out.println("Sorry you dont have any money left to use!!");
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Sorry you dont have any money left to use!!");
			mainClass.lineNumber++;
			mainClass.printToCustomerFile.close();

			System.out.println("cCount ="+mainClass.lineNumber);
			Scanner cscanFile = Dispenser.createTextRead(mainClass.customerActivity);// scan a file
			int cCount=mainClass.lineNumber;
			System.out.println(mainClass.lineNumber+"== main class counter");

			System.out.println("\n Comming from reading the actual custormer file:");
			for (mainClass.lineNumber = 1; mainClass.lineNumber <= cCount; mainClass.lineNumber++)
			{
				mainClass.cline = cscanFile.nextLine();
				System.out.println(mainClass.cline);
			}
			cscanFile.close();
			System.exit(0);
		}
		else
		{
			a.method(getMoneyAvailableTobuy());
		}
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

	public double getMoneyAvailableTobuy() {
		return moneyAvailableTobuy;
	}

	public void setMoneyAvailableTobuy(double moneyAvailable) {
		this.moneyAvailableTobuy = moneyAvailable;
	}

	public double getMoneySpent() {
		return moneySpent;
	}

	public void setMoneySpent(double moneySpent) {
		this.moneySpent = moneySpent;
	}
}