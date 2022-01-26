package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi implements Rbi
{
	Account ac=null;
	int count=0;
	Account ac1[]=new Account[100];
			boolean b=true;

	@Override
	public void createAccount()
	{
		ac=new Account();
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter acc no");
		while(true)
		{
		long accNo=sc.nextLong();
	   // for(int i=0;i<count;i++)
		
			
			long m=accNo;
			long count=0;
			while(m>0)
			{
				m=m/10;
				count++;
			}
			if(count==11)
			{
				ac.setAccNo(accNo);;
				break;
			}
			else
			{
				System.out.println("acc no is invalid");
			}
			System.out.println("plz enter correct acc no");
			
		}
		
		System.out.println("plz enter your name");
		sc.nextLine();
		String name=sc.nextLine();
	    ac.setName(name);
	    
	    System.out.println("plz enter correct mob no");
	     while(true)
	     {
	    	 String mobNo=sc.next();
	    	 int  a1=mobNo.length();
	    	 
	    	 if(mobNo.matches("[7-9][0-9]{9}"))
	    	 {
	    		ac.setMobNo(mobNo);
	    		//System.out.println("mob no is successes fully verified"+ac1[i].getMobNo());
	    		break;
	    	 }
	    	 else 
	    	 {
	    		 System.out.println("no is not vLID");
	    		 
	    	 }
	    	 System.out.println("plz enter correct MOB no");
	     }
	    
	     System.out.println("plz ENTER ADhR NO");
	     while(true)
	     {
	    	 String adharNo=sc.next();
	    	 int  a1=adharNo.length();
	    	 
	    	 if(a1==12)
	    	 {
	    		ac.setAdharNo(adharNo);
	    	//	System.out.println("mob no is successes fully verified"+ac1[i].getAdharNo());
	    		break;
	    	 }
	    	 else 
	    	 
	    	 {
	    		 System.out.println("no is not vLID");
	    		 
	    	 }
	    	 System.out.println("plz enter correct adahr no");
	     }
	     
	     System.out.println("plz enter your gender");
			sc.nextLine();
			String gender=sc.nextLine();
		     ac.setGender(gender);
		    
		    System.out.println("plz enter your age");
			int age=sc.nextInt();
			ac.setAge(age);
		    
		    System.out.println("plz enter your balance");
			double balance=sc.nextDouble();
			ac.setBalance(balance);
		
		    ac1[count]=ac;
		    count++;
		    
}

	@Override
	public void displayAllDetails() 
	{
		Scanner sc3=new Scanner(System.in);
		System.out.println("plz enter acc no");
		long n=sc3.nextLong();
		int d=1;
		while(true)
		{
		for(int i=0;i<count;i++)
		{
			
			if(n==ac1[i].getAccNo())
			{
				d=0;
		// TODO Auto-generated method stub
		 System.out.println("accont no is ="+ac1[i].getAccNo());
		 System.out.println("accont name no = "+ac1[i].getName());
		 System.out.println("mob no is ="+ac1[i].getMobNo());
		 System.out.println("adhar no is ="+ac1[i].getAdharNo());
		 System.out.println("age no is ="+ac1[i].getAge());
		 System.out.println("gender is ="+ac1[i].getGender());
		 System.out.println("balnce is ="+ac1[i].getBalance());
		 break;
			}
			
		
		   
		}
		if(d!=0)
		{
			System.out.println("invalid acc no");
			
			System.out.println("plz reenter acc no");
			n=sc3.nextLong();
		}
		else
		{
		break;
		}
	}
	}
	
	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		System.out.println("plz enter acc no");
		
		int accc=0;
		
		while(true)
		{
			long d=sc1.nextLong();
			
		for(int i=0;i<count;i++)
		{
			if(d==ac1[i].getAccNo())
			{	
        	 accc=1;
        	System.out.println("plz enter amt");
        	double m=sc1.nextDouble();
		//System.out.println("your balance is "+(m+ac1[i].getBalance()));
		 ac.setBalance(m+ac1[i].getBalance());
		 break;
		
			}	
		}	
           if(accc!=1)
			{
				System.out.println("invalid acc no");
				
			}
			else
			{
				break;
			}
           System.out.println("plz enter acc no");
			//d=sc1.nextLong();
		}
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		Scanner sc2=new Scanner(System.in);
		System.out.println("plz enter acc no");
	
		int accc=0;
		while(true)
		{
			long d=sc2.nextLong();
		for(int i=0;i<count;i++)
		{
			accc=1;
			
			if(d==ac1[i].getAccNo())
			{
		System.out.println("plz enter withdrwal money");
		int w=sc2.nextInt();
		if((ac1[i].getBalance())>w)
		System.out.println("your balance is "+(ac1[i].getBalance()-w));
		ac.setBalance(ac1[i].getBalance()-w);
		break;
			}
		}
		
			if(accc!=1)
			{
				System.out.println("invalid acc no");
			}
			else
			{	
			break;
			}
			System.out.println("plz enter acc no");
	}
	}
	

	@Override
	public void balanceCheck()
	{
		// TODO Auto-generated method stub
		Scanner sc4=new Scanner(System.in);
		System.out.println("plz enter acc no");
		
		int accc=1;
		while(true)
		{
			long d=sc4.nextLong();
		for(int i=0;i<count;i++)
		{
			accc=1;
			
			if(d==ac1[i].getAccNo())
			{
		
		System.out.println("ur balance is  ="+ac1[i].getBalance());
		
			}
		}
			if(accc!=1)
			{
				System.out.println("invalid acc no");
			}
			else
			{
				break;
			}
			System.out.println("plz enter acc no");
		
	}
	}
}
