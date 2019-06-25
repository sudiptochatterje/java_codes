public class MultiThread2 {
	
	public static void main (String[] args) {
		CharType c=new CharType();
		IntType i=new IntType();
		Thread t1=new Thread(c);
		Thread t2=new Thread(i);
		t1.start();
		t2.start();
	}
}
class CharType implements Runnable
{
	public void run()
	{
		try
		{
			int n=65;
			for(int i=0;i<6;i++)
			{
				System.out.println((char)(n++));
				Thread.sleep(2000);
			}
	    }
		catch(Exception e)
		{
			System.out.println("interrupted");
		}
    }
}
class IntType implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<6;i++)
			{
				System.out.println(i*i);
				Thread.sleep(2000);
			}
		}
		catch (Exception e)
		{
			System.out.println("interrupted");
		}
    }
   
}
