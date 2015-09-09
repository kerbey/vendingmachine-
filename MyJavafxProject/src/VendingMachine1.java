import java.util.Scanner;
public class VendingMachine1
{
	static int choices;
	public void VendingMachine()
	{
		choices=1;
		machineSwitch();
		if(choices==1)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser1");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser1 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser1();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==2)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser2");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser2 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser2();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();	
		}
		else if(choices==3)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser3");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser3 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser3();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==4)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser4");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser4 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser4();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==5)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser5");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser5 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser5();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==6)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser6");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser6 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser6();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==7)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser7");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser7 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser7();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==8)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser8");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser8 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser8();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==9)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+ "you will use dispenser9");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser9 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser9();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==10)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser10");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser10 ");
			FoodInformation food= new FoodInformation();
			food.V1dispenser10();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
	}
	public static void machineSwitch()
	{
		int machineSwitch =(int)(Math.random()*2)+1;
		if(machineSwitch==0)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" the Machine is now turned off");
			mainClass.lineNumber++;
			System.out.println("the machine is now turned off");
			System.exit(0);
		}
		else if (machineSwitch==1)
		{
			System.out.println("machine is staying on");
		}		
	}	
}