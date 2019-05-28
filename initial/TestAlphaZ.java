class TestAlphaZ
{
	public static void main(String args[])
	{   
		int n=5;
		int k=n;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (i==0||i==n-1||j==k-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println("");
         k--;
		}
	}
}
