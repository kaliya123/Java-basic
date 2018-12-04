import java.util.*;
public class Prat3_1 
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string:");
		String var1 = s.next();
		System.out.println("Enter Letter");
		char c =s.next().charAt(0);
		
		for (int i=0;i < var1.length()-1;i++)
		{
			if (c==var1.charAt(i))
			{	
			count = count + 1;
			}
		}
		System.out.println("Occurence of the letter is:"+count);
	}

}
