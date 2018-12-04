import java.util.*;
import java.io.*;

interface Addition
{
	public void add(int x,int y);
}
class Vaideehi_I_SUM implements Addition
{
	public void add(int x,int y)
	{
		int c=x+y;
		System.out.println("Sum is :"+c);
	}
	
	public static void main(String srgs[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int f_num=s.nextInt();
		System.out.println("Enter the second number");
		int s_num=s.nextInt();
		Addition a= new Vaideehi_I_SUM();
		a.add(f_num,s_num);
	}
}

