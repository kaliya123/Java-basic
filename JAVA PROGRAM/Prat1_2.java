import java.util.*;
public class Prat1_2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the radius:");
		double radius = s.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("Area is:"+area);
	}

}
