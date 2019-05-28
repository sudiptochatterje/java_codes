class TestAlphak
{
	public static void main(String args[])
	{   
		int n=6;
		int k=n;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (j==0||j+n/2-1==i||j==k-n/2)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			k--;
			System.out.println("");
         
		}
	}
}
