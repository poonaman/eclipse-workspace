package com.pack;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAppPizza 
{
	public static void main(String[] args)
	{
		ArrayList<Double> array=new ArrayList<>();
		double sum=0;
		int ch=0;
		int choice;
		Pizza pizza=null;
		Scanner sc=new Scanner(System.in);
		String ch2="";
		do
		{
		do
		{
			System.out.println("Select Pizza Which You Want");
			System.out.println("1.Veg");
			System.out.println("2.Non-Veg");
			System.out.println("Enter Your Choice");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Select Veg Pizza you want");
				   System.out.println("1.Panner Pizza");
				   System.out.println("2.Corn Pizza");
				   System.out.println("Enter your Choice");
				   int choice2=sc.nextInt();
				   switch(choice2)
				   {
				   case 1:
					pizza=new PannerPizza("PannerPizza",120);
					System.out.println("You have Selected"+pizza.getDescription());
					break;
				case 2:
					pizza=new CornPizza("CornPizza",150);
					System.out.println("You have Selected"+pizza.getDescription());
					break;
				   }
				   break;
			case 2:System.out.println("Select Non-Veg Pizza you want");
			   System.out.println("1.Chicken Pizza");
			   System.out.println("2.Chicken Fiesta");
			   System.out.println("Enter your Choice");
			   int choice3=sc.nextInt();
			   switch(choice3)
			   {
			   case 1:
				pizza=new ChickenPizza("ChickenPizza",170);
				System.out.println("You have Selected"+pizza.getDescription());
				break;
			   case 2:
					pizza=new ChickenFiesta("ChickenPizza",200);
					System.out.println("You have Selected"+pizza.getDescription());
					break;
			   }
			break;
			}
		}while(ch!=0);
		String ans="";
		int choice2;
		do
		{
			System.out.println("Select Toppings Which You Want");
			System.out.println("1.Olives");
			System.out.println("2.Tomatoes");
			System.out.println("Enter Your Choice");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				pizza=new Olives(pizza,"Olives",50);
				
				break;
			case 2:
				pizza=new Tomato(pizza,"Tomato",70);
			
				break;
			}
			System.out.println("Do You Want To Continue");
			ans=sc.next();
		}while(ans.equals("Y")||ans.equals("y"));
		
		System.out.println(" The price of it is "+pizza.getCost());
array.add(pizza.getCost());
		System.out.println("Do You Want To Continue");
		 ch2=sc.next();
		
		}
		while(ch2.equals("Y")||ch2.equals("y"));
		
		
		for(int i=0;i<array.size();i++)
		{
			sum=sum+array.get(i);
		}
		System.out.println( "The Total Price is "+sum);
		Payment pay=null;
		int choice3;
		do
		{
			System.out.println("Select Payment Mode");
			System.out.println("1.Credit Card");
			System.out.println("2.PayTM");
			System.out.println("3.DebitCard");
			System.out.println("Enter Your Cce");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				 pay=new CreditCard();
				pay.pay(sum,pay);
				
				break;
			case 2:
				 pay=new PayTm();
					pay.pay(sum,pay);
					
				
				break;
			case 3:
				 pay=new DebitCard();
					pay.pay(sum,pay);
					
				
				break;
			}
			
		}while(ch!=0);
		
		
		}

}
