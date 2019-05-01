/*
to print diamond inside star pattern for input 5
***********
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
***********
*/
import java.util.Scanner;
class PatternDiamond 
{

	public static void main(String[] args) 
	{
		System.out.println ("please input +ve integer");
		Scanner scan=new Scanner(System.in);
		int f=scan.nextInt();
		for (int a=1;a<=f+f+1;a++)
			System.out.print("*");
		System.out.println();
			for (int i=1;i<=f;i++)
			{
				for(int j=f;j>=i;j--)
					System.out.print("*");
				for(int k=1;k<=2*i-1;k++)
					System.out.print(" ");
				for(int l=f;l>=i;l--)
					System.out.print("*");                        
			    System.out.println();
			}
				for (int m=f-1;m>=1;m--)
			{
				for(int n=f-1;n>=m-1;n--)
					System.out.print("*");
				for(int p=0;p<2*m-1;p++)
					System.out.print(" ");
				for(int o=f-1;o>=m-1;o--)
					System.out.print("*");
			    System.out.println();
			}
					for (int a=1;a<=f+f+1;a++)
			System.out.print("*");
		System.out.println();
	}

}