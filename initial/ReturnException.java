import java.util.*;
class Test
{
	public void add()throws Exception
	{
		try
		{
			Scanner scan=new Scanner(System.in);
		    int a=scan.nextInt();
		    int b=scan.nextInt();
		    int c=a/b;
		    System.out.println(c);
	    }
	    finally
	    {
			System.out.println("nope");
		}
	}
}
public class CustomException {
	
	public static void main (String[] args) {
		Test t=new Test();
		try
		{
			t.add();
		}
		catch(Exception e)
		{
			System.out.println("yes");
		}
	}
}

