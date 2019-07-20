public class DeadLock 
{	
	public static void main (String[] args) {
		Demo d=new Demo();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		t1.setName("volumeCylinder");
		t2.setName("volumeCone");
		t1.start();
		t2.start();
	}
}
class Demo implements Runnable 
{
	Double pie=new Double(3.14);
	Double radius=new Double(9);
	Double height=new Double(6);
	public void run()
	{
		Thread t=Thread.currentThread();
		if(t.getName()=="volumeCylinder")
		{
			System.out.println("volume of Cylinder"+volumeCylinder());
		}
		else
		{
			System.out.println("Volume of cone"+volumeCone());
		}
	}
	double volumeCylinder()
	{
		try
		{
			Thread.sleep(1500);
			synchronized(pie)
			{
					System.out.println("Cylinder aquired value of pie "+pie);
				Thread.sleep(1500);
				synchronized(radius)
				{
					System.out.println("Cylinder aquired value of radius "+radius);
					
					Thread.sleep(1500);
					synchronized(height)
					{
						System.out.println("Cylinder aquired value of height "+height);
					}
			    }
		    }
		}
		catch(Exception e)
		{
			System.out.println("interrupted");
		}
		return pie*radius*radius*height;
	}
	double volumeCone()
	{
		try
		{
			Thread.sleep(1500);
			synchronized(pie)
			{
				System.out.println("Cone aquired value of pie "+pie);
				Thread.sleep(1500);
				synchronized(radius)
				{
					System.out.println("Cone aquired value of radius "+radius);
					
					Thread.sleep(1500);
					synchronized(height)
					{
						System.out.println("Cone aquired value of height "+height);
					}
			    }
		    }
		}
		catch(Exception e)
		{
			System.out.println("interrupted");
		}
		return pie*radius*radius*height/3;
	}
}
