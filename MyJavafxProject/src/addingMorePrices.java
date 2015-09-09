
//public class addingMorePrices extends AddingPrices
{
	
}
/*{
 static int counterLays = 0, counterDoritos=0,counterDoritoes=0, counterLay =0
			, counterCheetos=0, counterFritos=0, counterRuffles=0, counterPringles=0, counterPopChips=0
			,counterBakedWise=0, counterDrSears=0, counterGlennys=0;
	//public static List <String> listOfItemPurchased= new ArrayList<String>( );
	 double lays=1.00, doritos=2.00, cheetos=.45, fritos=.32, ruffles=.44, pringles=.55,
			popChips=.66, bakedWise=1.55, drSears=2.33, glennys=.22, total,
	pepsi=2.00, cokezero=4.00, dietcoke=1.25, coke=1.34, 
	mountaindew=1.34, drpepper=2.37, dietmountaindew=.90, pepsimax=.65, sevenup=.45,
	 diet7up=.40,dietpeachteasnapple=2.40 , dietsweetenedNestea=.50, dietgreentea=.20,
	lemonicedtea=1.40, briskicedtea=1.40, liptonwhitetea=.40, greentea=.66,
	troptea=.55, rockatea=.33, rapberrytea=.99;
 */
	/*public double addOtherProducts(double moneyAvailableTobuy)
	{
		choices=input.nextInt();
		if (choices==1)
		{
			counterLays++;
			purchases=purchases+lays;
			if(moneyAvailableTobuy<lays)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy lays");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy lays");
				Dispenser d = new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought lays for: $"+ lays);
			mainClass.lineNumber++;
			System.out.println("you bought lays for: $"+ lays);
			createReceipt(choices, purchases);
		}
		else if (choices==2)
		{
			counterDoritoes++;
			purchases=purchases+doritos;
			if(moneyAvailableTobuy<doritos)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy doritos");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy doritos");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought doritos for: $"+ doritos);
			mainClass.lineNumber++;
			System.out.println("you bought doritos for: $"+ doritos);
			createReceipt(choices, purchases);
		}
		else if (choices==3)
		{
			counterCheetos++;
			purchases=purchases+cheetos;
			if(moneyAvailableTobuy<cheetos)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy cheetos");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy cheetos");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought cheetos for: $"+ cheetos);
			mainClass.lineNumber++;
			System.out.println("you bought cheetos for: $"+ cheetos);
			createReceipt(choices, purchases);
		}
		else if (choices==4)
		{
			counterFritos++;
			purchases=purchases+fritos;
			if(moneyAvailableTobuy<fritos)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy fritos");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy fritos");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought fritos for: $"+ fritos);
			mainClass.lineNumber++;
			System.out.println("you bought fritos for: $"+ fritos);
			createReceipt(choices, purchases);
		}
		else if (choices==5)
		{
			counterRuffles++;
			purchases=purchases+ruffles;
			if(moneyAvailableTobuy<ruffles)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy ruffles");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy ruffles");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought ruffles for: $"+ ruffles);
			mainClass.lineNumber++;
			System.out.println("you bought ruffles for: $"+ ruffles);
			createReceipt(choices, purchases);
		}
		else if (choices==6)
		{
			counterPringles++;
			purchases=purchases+pringles;
			if(moneyAvailableTobuy<pringles)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy pringles");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy pringles");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought pringles for: $"+ pringles);
			mainClass.lineNumber++;
			System.out.println("you bought pringles for: $"+ pringles);
			createReceipt(choices, purchases);
		}
		else if (choices==7)
		{
			counterPopChips++;
			purchases=purchases+popChips;
			if(moneyAvailableTobuy<popChips)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy popchips");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy popchips");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought popChips for: $"+ popChips);
			mainClass.lineNumber++;
			System.out.println("you bought popChips for: $"+ popChips);
			createReceipt(choices, purchases);
		}
		else if (choices==8)
		{
			counterBakedWise++;
			purchases=purchases+bakedWise;
			if(moneyAvailableTobuy<bakedWise)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy bakedWise");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy bakedWise");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought bakedWise for: $"+ bakedWise);
			mainClass.lineNumber++;
			System.out.println("you bought bakedWise for: $"+ bakedWise);
			createReceipt(choices, purchases);
		}
		else if (choices==9)
		{
			counterDrSears++;
			purchases=purchases+drSears;
			if(moneyAvailableTobuy<drSears)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy drSears");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy drSears");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought drSears for: $"+ drSears);
			mainClass.lineNumber++;
			System.out.println("you bought drSears for: $"+ drSears);
			createReceipt(choices, purchases);
		}
		else if (choices==10)
		{
			counterGlennys++;
			purchases=purchases+glennys;
			if(moneyAvailableTobuy<glennys)
			{
				mainClass.printToCustomerFile.println(mainClass.lineNumber+" you don't have enough money to buy glennys");
				mainClass.lineNumber++;
				System.out.println("you don't have enough money to buy glennys");
				Dispenser d= new Dispenser();
				d.end();
				System.exit(0);
			}
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought glennys for: $"+ glennys);
			mainClass.lineNumber++;
			System.out.println("you bought glennys for: $"+ glennys);
			createReceipt(choices, purchases);
		}
		else
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" wrong message please enter again");
			mainClass.lineNumber++;
			System.out.println("wrong message please enter again");
			AddingPrices add=new AddingPrices();
			add.V1dispenser1(moneyAvailableTobuy);
		}
		return purchases;
	}*/
	public double method(double moneyAvailableTobuy)
	{
		String choices=input.next();
		if (choices!=null)
		{
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" What is the price?");
			mainClass.lineNumber++;
			System.out.println("what is the price?");
			prices=input.nextDouble();
			purchases=purchases+lays;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/prices)+" bag of "+choices+" chips= $" + lays);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/prices)+" bag of "+choices+" chips= $" + prices);
			line=listOfItemPurchased[amountOfItems]=prices+" "+choices;
		}
		/*else if (choices.contains("doritos"))
		{
			purchases=purchases+doritos;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/doritos)+" bag of "+choices+" chips= $" + doritos);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/doritos)+" bag of "+choices+" chips= $" + doritos);
			line=listOfItemPurchased[amountOfItems]=doritos+" "+choices;
		}
		else if (choices.contains("cheetos"))
		{
			purchases=purchases+cheetos;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/cheetos)+" bag of "+choices+" chips= $" + cheetos);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/cheetos)+" bag of "+choices+" chips= $" + cheetos);
			line=listOfItemPurchased[amountOfItems]=cheetos+" "+choices;
		}
		else if (choices.contains("fritos"))
		{
			purchases=purchases+fritos;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/fritos)+" bag of "+choices+" chips= $" + fritos);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/fritos)+" bag of "+choices+" chips= $" + fritos);
			line=listOfItemPurchased[amountOfItems]=fritos+" "+choices;
		}
		else if (choices.contains("ruffles"))
		{
			purchases=purchases+ruffles;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/ruffles)+" bag of "+choices+" chips= $" + ruffles);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/ruffles)+" bag of "+choices+" chips= $" + ruffles);
			line=listOfItemPurchased[amountOfItems]=ruffles+" "+choices;
		}
		else if (choices.contains("pringles"))
		{
			purchases=purchases+pringles;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/pringles)+" bag of "+choices+" chips= $" + pringles);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/pringles)+" bag of "+choices+" chips= $" + pringles);
			line=listOfItemPurchased[amountOfItems]=pringles+" "+choices;
		}
		else if (choices.contains("popChips"))
		{
			purchases=purchases+popChips;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/popChips)+" bag of "+choices+" chips= $" + popChips);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/popChips)+" bag of "+choices+" chips= $" + popChips);
			line=listOfItemPurchased[amountOfItems]=popChips+" "+choices;
		}
		else if (choices.contains("bakedWise"))
		{
			purchases=purchases+bakedWise;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/bakedWise)+" bag of "+choices+" chips= $" + bakedWise);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/bakedWise)+" bag of "+choices+" chips= $" + bakedWise);
			line=listOfItemPurchased[amountOfItems]=bakedWise+" "+choices;
		}
		else if (choices.contains("drSears"))
		{
			purchases=purchases+drSears;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/drSears)+" bag of "+choices+" chips= $" + drSears);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/drSears)+" bag of "+choices+" chips= $" + drSears);
			line=listOfItemPurchased[amountOfItems]=drSears+" "+choices;
		}
		else if (choices.contains("glennys"))
		{
			purchases=purchases+glennys;
			mainClass.printToCustomerFile.println(mainClass.lineNumber+" Your Receipt for " +(purchases/glennys)+" bag of "+choices+" chips= $" + glennys);
			mainClass.lineNumber++;
			System.out.println("Your Receipt for " +(purchases/glennys)+" bag of "+choices+" chips= $" + glennys);
			line=listOfItemPurchased[amountOfItems]=glennys+" "+choices;
		}
		//dietpeachteasnapple=2.40 , dietsweetenedNestea=.50, dietgreentea=.20,"
				//+ "lemonicedtea=1.40, brisk iced tea=1.40, liptonwhitetea=.40, greentea=.66,"
				//+ " troptea=.55, rockatea=.33, rapberrytea=.99
		
		mainClass.printToCustomerFile.println(mainClass.lineNumber+" you bought "+choices+" for: $"+ purchases);
		mainClass.lineNumber++;
		System.out.println(" you bought "+choices+" for: $"+ purchases);
		System.out.println("this is from the arrayList in the addingPricesClass: "+listOfItemPurchased[amountOfItems]);
		System.out.println("count"+count+"line"+line);
		textStreamForCustomerReceipt.println(count+" "+line);
		count++;
		//System.out.println("this is from the arrayList in the addingPricesClass:" + listOfItemPurchased.size());
		//listOfItemPurchased.add(" $1.00 lays");
		System.out.println("amountOfItems "+amountOfItems);
		System.out.println("arraysize "+arraysize);
		arraysize++;
		amountOfItems++;
		return purchases;
	}
}*/