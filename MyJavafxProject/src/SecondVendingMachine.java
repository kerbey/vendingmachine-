
public class SecondVendingMachine
{
	static int choices;
	public void SecVendingMachine()
	{
		choices=(int)(Math.random()*2)+1;
		VendingMachine1.machineSwitch();
		if(choices==1)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser1");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser1 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser1();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==2)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser2");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser2 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser2();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();	
		}
		else if(choices==3)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser3");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser3 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser3();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==4)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser4");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser4 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser4();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==5)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser5");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser5 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser5();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==6)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser6");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser6 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser6();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==7)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser7");
			mainClass.lineNumber++;
			mainClass.printToCustomerFile.println("you will use dispenser7");
			System.out.println("you will use dispenser7 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser7();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==8)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser8");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser8 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser8();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==9)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+ "you will use dispenser9");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser9 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser9();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
		else if(choices==10)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you will use dispenser10");
			mainClass.lineNumber++;
			System.out.println("you will use dispenser10 ");
			FoodInformation food= new FoodInformation();
			food.V2dispenser10();
			Dispenser dispenser=new Dispenser();
			dispenser.dispensers();
		}
	}

}
