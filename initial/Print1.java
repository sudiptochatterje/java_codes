class Print1
{
	public static void main (String[]args)
	{
		for(int i=0;i<4;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("1");
			}
			System.out.println();
			Test t=new Test();
		}
	}
}
class Test
{
	public void name()
	{
		int height=9;
	}
}
