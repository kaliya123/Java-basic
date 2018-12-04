class A
{
	A()
	{
		System.out.println("Constructor");
	}
	A(int a,int b)
	{
		int c = a+b;
		System.out.println("Addition Constructor"+c);
	}
}
public class Pra7_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Before Constructor");
		A obj = new A();
		A obj2 = new A(12,21);
		System.out.println("After Constructor");
	}

}
