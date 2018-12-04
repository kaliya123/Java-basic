import java.io.*;
import java.util.*;

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
class saving implements Account
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
class overdraf implements Account
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
class Vaideehi_14_2
{
	public static void main(String args[])
	{
		int acc_main_bal=100000;
		System.out.println("Enter what you want to do ?");
		System.out.println("Enter 1 for deposit");
		System.out.println("Enter 2 for withdraw");
		Scanner s=new Scanner(System.in);
		Account ac=new current();
		Account as=new saving();
		Account ao=new overdraf();
		int cho=s.nextInt();
		if(cho==1)
		{
		System.out.println("Enter the amout");
		int amout=s.nextInt();
		int final_bal_c=ac.deposit(acc_main_bal,amout);
		System.out.println("Final amount of current is:"+final_bal_c);
		int final_bal_s=as.deposit(acc_main_bal,amout);
		System.out.println("Final amount of saving is:"+final_bal_s);
		int final_bal_o=ao.deposit(acc_main_bal,amout);
		System.out.println("Final amount of overdraf is:"+final_bal_o);		
		}
		if(cho==2)
		{
		System.out.println("Enter the amout");
		int amout=s.nextInt();
		if (acc_main_bal<amout)
		{
			System.out.println("plase enter proper amount");
		}
		else
		{
		int final_bal_c=ac.withdraw(acc_main_bal,amout);
		System.out.println("Final amount of current is:"+final_bal_c);
		int final_bal_s=as.withdraw(acc_main_bal,amout);
		System.out.println("Final amount of saving is:"+final_bal_s);
		int final_bal_o=ao.withdraw(acc_main_bal,amout);
		System.out.println("Final amount of overdraf is:"+final_bal_o);
		}		
		}
	}
}

