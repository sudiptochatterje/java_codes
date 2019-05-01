/*
output for 5
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/

import java.util.Scanner;
class StarFour
{
	public static void main (String[]args)
	{
		System.out.println("please Enter a Number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=n;j>=i;j--)
				System.out.print(" ");
			
			for (int k=1;k<=2*i-1;k++)
				System.out.print("*");
			
			System.out.println();
		}
				for (int l=n-1;l>=1;l--)
		{
			for (int m=n;m>=l;m--)
				System.out.print(" ");
			
			for (int o=1;o<=2*l-1;o++)
				System.out.print("*");
			
			System.out.println();
		}
    }
}