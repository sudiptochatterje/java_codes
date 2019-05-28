class Bird
{
	public static void main(String[]args)
	{
		int count=1;
		double n=1200,c,a=30,z;
	   for (int i=1;i<=50;i++)
	   {
		   c=n/90;
		   z=2*a*c;
		   n=n-z;
		   int k=(int)n;
		   System.out.println("distance travel by bird per trip = "+k);
		   if (k==1)
		   break;
		   count++;
   }
   System.out.println("trip made by bird "+count);
   }
}
