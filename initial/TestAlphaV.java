class TestAlphaV
{
	public static void main(String args[])
	{   
		int n=6;
		int k=n;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (j==i)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if (j==k-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println("");
         k--;
		}
	}
}
