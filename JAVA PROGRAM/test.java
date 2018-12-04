import java.util.*;
import java.io.*;

abstract class outer
{
	public void box()
	{
		System.out.print("this is outer class ");
		
	}
	public void kk()
		{
			System.out.print("This is outer 2 class");
		}
	

}
 class inner extends outer
 {
		public void kk()
		{
			System.out.print("This is inner class");
		}
}
class test
{
	public static void main(String []args)
	{
		// outer o=new outer();
		inner i=new inner();
		i.kk();
		i.box();
		
	}
}
