public class InterCommunication
{
	
	public static void main (String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.start();
		c.start();
	}
}
class Queue
{
	int x;
	boolean value_in_x;
	synchronized public void put(int i)
	{
		try
		{
			if(value_in_x==true)
			{
				wait();
			}
			else
			{
				x=i;
				System.out.println("i have put into x "+x);
				value_in_x=true;
				notify();
			}
		}
		catch(Exception e)
		{
			System.out.println("interrupted");
		}
	}	
	synchronized public void get()
	{
		try
		{
			if(value_in_x==false)
			{
				wait();
			}
			else
			{
				System.out.println("i have taken from x "+x);
				value_in_x=false;
				notify();
			}
		}
		catch (Exception e)
		{
			System.out.println("intrupted");
		}
	}
}
class Producer extends Thread
{
	Queue b;
	public Producer(Queue b)
	{
		this.b=b;
	}
	public void run()
	{
		int i=0;
		while (true)
		b.put(i++);
	}
}
class Consumer extends Thread
{
	Queue b;
	public Consumer(Queue b)
	{
		this.b=b;
	}
	public void run()
	{
		while(true)
		b.get();
	}
}
