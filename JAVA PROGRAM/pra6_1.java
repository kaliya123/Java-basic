/*AIM: MODELING EMPLOYEE DATA
Write a program to create a class named employee with eno, name, salary, basic,
da and hra as an attributes. Write a function to input, calculate and display salary
of the 100 employee. Use the array of objects to create data for n employees. Take
the value of n as well as details of all employees from user. Finally, compute salary
for all users and display them on the console with employee no.
 */
import java.util.Scanner;
class employee
{
	int eno;
	String name;
	double salary, basic, da, hra;
	private Scanner s;
	public void input()
	{
		s = new Scanner(System.in);
		System.out.print("Employee number:");
		eno = s.nextInt();
		System.out.print("Employee name:");
		name = s.next();
		System.out.print("Employee basic:");
		basic = s.nextDouble();
		System.out.print("Employee da:");
		da =s.nextDouble();
		System.out.print("Employee hra:");
		hra = s.nextDouble();
		System.out.println("--------------------------------------------------------------------------");
	}
	public void cal()
	{
		salary = basic + da + hra;
	}
	public void display()
	{
		System.out.println("Employee Number is:"+eno);
		System.out.println("Employee Name is:"+name);
		System.out.println("Employee Salary is:"+salary);
		System.out.println("--------------------------------------------------------------------------");
		
	}
}
public class pra6_1 
{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter data");
		employee e[] = new employee[2];
		for (i=0;i<=e.length;i++)
		{
			e[i] = new employee();
			e[i].input();
			e[i].cal();
			e[i].display();
		}

	}
}
