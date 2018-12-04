import java.io.*;
import java.util.*;
class Vaideehi_15_1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of arry :");
		int size_array=s.nextInt();
		int ar[]=new int [size_array];
		for (int i=0;i<=size_array;i++)
		{
		try
		{
			System.out.println("Enter 1 for add");
			System.out.println("Enter 2 for break");
			int num=s.nextInt();
			if (num == 1)
			{
				System.out.println("Enter number");
				int input=s.nextInt();
				ar[i]=input;
			}
			if (num == 2)
			{
				break;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){System.out.println(e); break;}
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("Final array is ");
		for(int i=0;i<size_array;i++)
		{
			System.out.println(ar[i]);
		}
	}
}


