
public class Pra10_1
{
	static void getdata(int a,int b)
	{
		int c = a + b;
		System.out.println("Addition is:"+c);
	}
	static void getdata(int a,int b,int d)
	{
		int c = a + b + d;
		System.out.println("Addition is:"+c);
	}

	public static void main(String[] args) 
	{
		getdata(2,3);
		getdata(2,3,4);

	}

}
