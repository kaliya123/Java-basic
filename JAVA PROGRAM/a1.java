import java.util.*;
class a1
{
	static void valid(int x)
	{
		if(x<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("Vote eli");
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		valid(a);
		/*int b=s.nextInt();
		try
		{
			int i=a/b;
			System.out.println("Try part and ans is"+i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is arethmatiocexception hendling"+e);
		}
		catch(Exception v)
		{
			System.out.println("this is exception");
		}
		finally
		{
			System.out.println("finally block");
		}*/
		
	}
}