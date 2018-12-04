import java.util.*;
public class Prat3_2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value:");
		int var1 = s.nextInt();
		String str="";
		while(var1>0)
		{
			int ans = var1%10;
			if(ans % 2==0)
			{
				str=""+ans+""+str;
			}
			var1=var1/10;
		}
		System.out.println("Value"+str);
	}

}
