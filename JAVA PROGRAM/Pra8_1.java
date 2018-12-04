import java.util.*;
import java.io.*;
class error
{
	static void display(String a)
	{
		System.out.println(a);
	}
	static void message(String b)
	{
		System.out.println(b);
	}
}
public class Pra8_1
{

	public static void main(String[] args)
	{
		System.out.println("Enter two strings:");
		Scanner s = new Scanner (System.in);
		String a = s.next();
		String b = s.next();
		error e = new error();
		e.display(a);
		e.message(b);
	}

}
