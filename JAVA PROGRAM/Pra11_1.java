class sample
{
		int i;
		protected void finalize() 
		{
			System.out.print("Finallized Method called");
		}
}
public class Pra11_1 
{
	public static void main(String[] args) 
	{
		sample s = new sample();
		s.i = 200;
		s=null;
		System.gc();
	}

}
