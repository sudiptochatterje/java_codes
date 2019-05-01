/*
output for 5
1
12
123
1234
12345
*/

class StarFive
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			int k=1;
		for (int j=1;j<=i;j++)
		{
         System.out.print(k);
		 k++;
		}
     System.out.println();		
		}
	}
}