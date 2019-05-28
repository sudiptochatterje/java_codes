class TestAlphaX
{
	public static void main(String args[])
	{   
		int n=5;
		int k=n;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (j==i||j==k-1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			k--;
			System.out.println("");
         
		}
	}
}
