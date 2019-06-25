public class MultiThread1
{
	
	public static void main (String[] args) 
	{
		CharType c=new CharType();
		IntType i=new IntType();
		c.start();
		i.start();
	}
}
class CharType extends Thread
{
	public void run()
	{
		try
		{
			int n=65;
			for(int i=0;i<6;i++)
			{
				System.out.println((char)(n++));
				Thread.sleep(1000);
			}
	    }
		catch(Exception e)
		{
			System.out.println("interrupted");
		}
    }
}
class IntType extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<6;i++)
			{
				System.out.println(i*i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println("interrupted");
		}
    }
   
}
