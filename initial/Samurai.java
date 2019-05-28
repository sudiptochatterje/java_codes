class Samurai {
		public static void main(String[]args)
		{
			int n=11;
			for (int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				System.out.print(" ");
			for (int j=0;j<n;j++)
			{
				if ((j>=n/2-i&&j<=n/2+i)&&i<=n/2||j<=n/2&&i>=n/2&&j>=i-n/2&&j>=n/4||j>=n/2&&j<=n+n/2-1-i&&j<=3*n/4&&i>=n/2)
				System.out.print("*");
	            else
	            System.out.print(" ");				
			}
			System.out.println(" ");
			}
			for (int i=0;i<n;i++)
			{
			for (int j=0;j<n;j++)
			{
				if (j>=n-1-i&&j<=3*n/2-1-i||j>=n/2+i)
				System.out.print("@");
	            else
	            System.out.print(" ");				
			}
			for (int j=0;j<n;j++)
			{
				if (j>=0&&j<=i+n/4||j<=n-1&&j>3*n/4-1-i)
				System.out.print("#");
	            else
	            System.out.print(" ");				
			}
			for (int j=0;j<n;j++)
			{
				if (j<=i&&j>=i-n/2||j<=n/2-i)
				System.out.print("$");
	            else
	            System.out.print(" ");				
			}
			System.out.println(" ");
			}
			
		}
	}
