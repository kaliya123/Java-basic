import java.util.Scanner;

class B
{
	float area;
	B(float a)
	{
		area = a*a;
		System.out.println("Area of Square is:"+area);
	}
	B(float a,float b)
	{
		area = a*b;
		System.out.println("Aarea of rectangle is:"+area);
	}
	B(int r,float h)
	{
		area = (float) ((float) (2*3.14* r* h) + (2*3.14*r*r));
		System.out.println("Area of Cylinder is:"+area);
	}
}
public class Pra7_2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("********Area of rectangle********");
		System.out.print("Enter the Length:");
		float a = s.nextFloat();
		System.out.print("Enter the Breath:");
		float b = s.nextFloat();
		
		System.out.println("********Area of Square********");
		System.out.print("Enter the Length:");
		float c = s.nextFloat();
		
		System.out.println("********Area of Cylinder********");
		System.out.print("Enter the Radius:");
		int d = s.nextInt();
		System.out.print("Enter the Height:");
		float e = s.nextFloat();
		
		B obj1 = new B(a,b);
		B obj2 = new B(c);
		B obj3 = new B(d,e);
	}

}
