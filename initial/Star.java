/*
output for 5
*
**
***
****
*****
*/

import java.util.Scanner;
class Star
{
public static void main(String args[])
    {
	int i,j,n;
	System.out.println("Suggest a number:");
	Scanner usr=new Scanner(System.in);
	n=usr.nextInt();
	
	for (i=1;i<=n;i++)
	{
		for(j=0;j<i;j++)
			System.out.print("*");
		System.out.println();
	}
	
	}
}	