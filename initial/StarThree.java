/*
output for 5
    * 
   * * 
  * * * 
 * * * * 
* * * * *
*/

import java.util.Scanner;
class StarThree
{
	public static void main(String args[])
	{
		int i,j;
		System.out.println("please input number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(i=0;i<n;i++)
		{
		for(j=n-i;j>1;j--)
			System.out.print(" ");
		for (j=0;j<=i;j++)
			System.out.print("* ");
		System.out.println();
		}
	}
}