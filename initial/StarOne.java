/*
output for 5
    *
   **
  ***
 ****
*****
*/


import java.util.Scanner;
class StarOne
{
	public static void main(String args[])
{
	int i,j,k;
	System.out.println("give me a number");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	for (i=1;i<=n;i++)
	{
	for (j=1;j<=n-i;j++)
		System.out.print(" ");
	for (k=1;k<=i;k++)
		System.out.print("*");
	System.out.println();
	}
}
}