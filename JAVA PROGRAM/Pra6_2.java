/*AIM: BOOK DATA USING CLASS AND OBJECT
Write a program to create a class named Book with book no, book name, author name, prize and
publication name. Write a function to input and display data for 20 books. Use the Book class to
create an array of 20 books objects, initialize them from the inputs provided by user. After that,
display all data of 20 books on the console in well-formatted manner.
 */
import java.util.Scanner;
public class Pra6_2
{
	public static void main(String[] args) 
	{
		Booklet b[] = new Booklet[2];
		for (int i=0;i<b.length;i++)
		{
			b[i] = new Booklet();
			b[i].input();
		}
		for (int i=0;i<b.length;i++)
		{
			b[i].display();
		}
	}
}
class Booklet
{
	int bno;
	String bname,authore,publication;
	double prize;
	Scanner s1 = new Scanner(System.in);
	public void input()
	{
		System.out.print("Enter Book Number:");
		bno = s1.nextInt();
		System.out.print("Enter Book Name:");
		bname = s1.next();
		System.out.print("Enter Authore Name:");
		authore = s1.next();
		System.out.print("Enter Publicationk Name:");
		publication = s1.next();
		System.out.print("Enter Book Prize:");
		prize = s1.nextDouble();
	}
	public void display()
	{
		System.out.print("Book Number is:"+bno);
		System.out.println("Book Name is:"+bname);
		System.out.println("Authore Name is:"+authore);
		System.out.println("Publication is:"+publication);
		System.out.println("Prize is:"+prize);
	}
}
