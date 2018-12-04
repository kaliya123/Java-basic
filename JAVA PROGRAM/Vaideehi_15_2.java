import java.io.*;
import java.util.*;
import java.io.IOException;

interface Account
{
	public int deposit(int x,int y);
	public int withdraw(int x,int y);
}
class current implements Account
{
	public int deposit(int x,int y)
	{
		return x+y; 
	}
	public int withdraw(int x,int y)
	{
		return x-y; 
	}
 	
}

class error extends Exception
{
	public static void chake()throws Exception
	{
		throw new Exception("......................Error is handeled................. ");
	}
}
class Vaideehi_15_2
{
	
	public static void main(String args[])
	{
		int acc_main_bal=100000;
		System.out.println("Enter what you want to do ?");
		System.out.println("Enter 1 for deposit");
		System.out.println("Enter 2 for withdraw");
		Scanner s=new Scanner(System.in);
		Account a=new current();
		int cho=s.nextInt();
		if(cho==1)
		{
		System.out.println("Enter the amout");
		int amout=s.nextInt();
		int final_bal=a.deposit(acc_main_bal,amout);
		System.out.println("Final amount of current is:"+final_bal);	
		}
		if(cho==2)
		{
		System.out.println("Enter the amout");
		int amout=s.nextInt();
		if(acc_main_bal<amout)
		{
			error r=new error();
			try
			{
				throw new error();
			}
			catch(error e){System.out.println(e);}
		}
		else
		{
		int final_bal=a.withdraw(acc_main_bal,amout);
		System.out.println("Final amount of current is:"+final_bal);
		}		
		}
	}
}