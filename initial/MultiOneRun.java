public class MultiOneRun {
	
	public static void main (String[] args)throws Exception {
		Work w=new Work();
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		t1.setName("char");
		t1.start();
		t2.setName("num");
		t2.start();
		Thread t=Thread.currentThread();
		Thread.sleep(9000);
		t.interrupt();
		System.out.println("main is executing");
	}
}
class Work implements Runnable
{
	public void run()
	{
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(name=="char")
		{
			charPrint();
		}
		else
		{
			numPrint();
		}
	}
	public void charPrint()
	{
		try
		{
			char a='A';
			for(int i=0;i<10;i++)
			{
				System.out.println((char)a++);
				Thread.sleep(3000);
			}
	    }
	    catch(Exception e)
	    {
		}
	}
	public void numPrint()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(3000);
				System.out.println(i);
			}
	    }
	    catch(Exception e)
	    {
		}
	}
}

