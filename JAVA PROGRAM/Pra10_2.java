import java.util.Scanner;

class Abc
{
	int area(int a)
	{
		return(a * a);
	}
	int area(int a,int b)
	{
		return ( a * b );
	}
	double area(int r,int h,double pi)
	{
		return ((2*pi*r*h)+(2*pi*r*r));
	}
}
public class Pra10_2 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Length of Square:");
		int len = s.nextInt();
		System.out.println("Enter the length of Rectangel:");
		int len_rec = s.nextInt();
		System.out.println("Enter the breath of Rectangle:");
		int bre = s.nextInt();
		System.out.println("Enter the radius of cylinder:");
		int r = s.nextInt();
		System.out.println("Enter the height of cylinder:");
		int h = s.nextInt();
		double pi = 3.14;
		Abc n = new Abc();
		int c = n.area(len);
		int e = n.area(len_rec, bre);
		double d= n.area(r, h, pi);
		System.out.println("Area of Square is:"+c);
		System.out.println("Area of Rectangel is"+e);
		System.out.println("Area of Square is:"+d);
	}

}
