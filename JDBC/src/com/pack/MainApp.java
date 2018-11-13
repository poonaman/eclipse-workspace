package com.pack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainApp 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		int ch;
		int resr=1;
		String ans="";
		Scanner sc=new Scanner(System.in);
		Customer cust=new Customer();
		System.out.println("Enter Customer Id");
		int idc=sc.nextInt();
		System.out.println("Enter Customer name");
		String namec=sc.next();
	   if(cust.selectCustomer(idc, namec))
		
		{
			System.out.println("Already Exist");
		}
		else
		{
			cust.insertCustomer(idc,namec);
			System.out.println("Customer Registered");
		}
	do
	{

		System.out.println("Select Option");
		System.out.println("1.Insert");
		System.out.println("2.View Product");
		System.out.println("3.Order Product");
		System.out.println("4.View Product Order Of Particular Customer");
		System.out.println("5.Delete Product Order Of Particular Customer by Its id");
		System.out.println("6.Update Product Order Of Particular Customer by Its quantity");
		System.out.println("Enter Your Choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Id of an Product ");
			int id=sc.nextInt();
			System.out.println("Enter Name of an Product ");
			String name=sc.next();
			System.out.println("Enter Category of an Product ");
			String category=sc.next();
			cust.insertProduct(id,name,category);
			break;
		case 2:
			cust.selectProduct();
			break;
		case 3:
			int count=1;
			cust.selectProduct();
			System.out.println("Enter Product id of product which you you want to purchase");
			int idproduct=sc.nextInt();
			ResultSet rs=cust.selectProduct(idproduct);
		
			ResultSet res=cust.selectOrders(idproduct);
	        ResultSet rsv=cust.selectOrders();
	       
			if((cust.selectOrder(idproduct)))
			{
			    int result=res.getInt(5);
			    System.out.println(result);
			     resr=res.getInt(5);
			    resr=resr+1;
				System.out.println(count);
				cust.updateOrder(idproduct, resr);
				System.out.println("already Prsent"+count);
			}
			else
			{
				count=1;
				cust.insertOrder(idc, idproduct, rs.getString(2),rs.getString(3),count);
			}
	        
			break;
		case 4:
			cust.selectOrderV(idc);
			break;
		case 5:
			cust.selectOrderV(idc);
			System.out.println("Enter Product to be deleted from orders table ");
			int pid=sc.nextInt();
			cust.deleteOrderP(pid);
			break;
		case 6:
			cust.selectOrderV(idc);
			System.out.println("Enter Product to be Updated from orders table ");
			int prid=sc.nextInt();
			System.out.println("enter Quantity of an product which you want");
			int quantity=sc.nextInt();
			cust.updateOrder(prid, quantity);
			break;
		}
	
	
 System.out.println("Do You Want To Continue");
 ans=sc.next();
	}
	while((ans.equals("Y"))||(ans.equals("y"))); 
	if(ans.equals("N")||ans.equals("n"))
	{
		cust.deleteOrderC(idc);
		
	}
}
	

	}
	
		
