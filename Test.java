package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("welocme in HDFC BANK ATM");
		Rbi bank=new Sbi();
	
		
		String s="yes";
		while(s.equalsIgnoreCase("yes"))
		{
			System.out.println("1.FOR CREAT ACCOUNT");
			System.out.println("2.FOR DISPLAY ALL DETAILS");
			System.out.println("3.FOR DEPOSITE MONEY");
			System.out.println("4.FOR WITHDRAL");
			System.out.println("5.FOR BALANCE CHECK");
			System.out.println("6.FOR EXIT");
			System.out.println("ENTER THE NUMBER");
			
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			
			switch(a)
			{
			case 1:
				bank.createAccount();
				break;
			case 2:
				bank.displayAllDetails();
				break;
			case 3:
				bank.depositeMoney();
				break;
			case 4:
				bank.withdrawal();
				break;
			case 5:
				bank.balanceCheck();
				break;
			case 6:
				System.out.println("thanks for visit");
				System.exit(0);
				
			default:
				System.out.println("please correct option");
			}
			System.out.println("preass yes to continue");
			String b=sc.next();
				s=b;
				
			}
					
		
			
		}
		
		
	 
		
		
	}


