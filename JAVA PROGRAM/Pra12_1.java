import java.util.Scanner;

class Rectangle
{
	int area_of_rectangle;
	void area(int length,int breath)
	{
		area_of_rectangle = length * breath;
	}
	/*void display()
	{
		System.out.println("Area of Rectangle is:"+area_of_rectangle);
	}*/
}
class RoundRest extends Rectangle
{
	int perimeter_of_rectangle;
	void perimeter(int length, int breath)
	{
		perimeter_of_rectangle = 2*(length + breath);
	}
	void disp()
	{
		System.out.println("Perimeter of Rectangle is:"+perimeter_of_rectangle);
		System.out.println("Area of Rectangle is:"+area_of_rectangle);
	}
}
public class Pra12_1 
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		int length = n.nextInt();
		System.out.println("Enter the breath of rectangle:");
		int breath = n.nextInt();
		RoundRest s = new RoundRest();
		s.area(length, breath);
		s.perimeter(length, breath);
		s.disp();
	}

}
