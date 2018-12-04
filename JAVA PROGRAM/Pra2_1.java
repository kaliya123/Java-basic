import java.io.*;
import java.util.*;
class Pra2_1
{
	public static void main(String args[])
	{
		int sum=0,flag=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i++)
		{
			if((n%i)==0)
			{
				for(int j=2;j<i;j++)
				{
					if ((i%j)==0)
					{
						flag=1;
					}
				}
				if (flag==0)
				{
					sum=sum+i;
					System.out.println(i);
				}
			}
		}
		System.out.print(sum);
    }
}