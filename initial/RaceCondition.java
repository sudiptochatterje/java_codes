class RaceCondition {
	
	public static void main (String[] args) {
		Test12 l=new Test12();
		Thread t1=new Thread(l);
		Thread t2=new Thread(l);
		Thread t3=new Thread(l);
		t1.setName("incdec");
		t2.setName("decinc");
		t3.setName("check");
		t1.start();
		t2.start();
		t3.start();
	}
}
	class Test12 implements Runnable
	{
		int t=6,i=6;
		synchronized public void run()
		{
			Thread t=Thread.currentThread();
			String s=t.getName();
			if(s=="incdec")
			{
				incdec();
			}
			else if(s=="decinc")
			{
				decinc();
			}
			else
			{
				check();
		    }
		}
		void incdec()
		{
			try
			{
				for(int j=0;j<3;j++)
				{
					System.out.println("incdec is executing i="+i);
					i++;
					Thread.sleep(1500);
					i--;
			    }
		    }
		    catch(Exception e)
		    {
			}
		}
		void decinc()
		{
			try{
				for(int j=0;j<3;j++)
				{
					System.out.println("decinc is executing i="+i);
					i--;
					Thread.sleep(1500);
					i++;
			    }
		    }
		    catch(Exception e)
		    {
			}
		}
		void check()
		{
			try
			{
				for(int j=0;j<3;j++)
				{
					Thread.sleep(1500);
					if(t==i)
					System.out.println("true");
					else
					System.out.println("false");
				}
		    }
		    catch(Exception e)
		    {
			}
	    }
	}

