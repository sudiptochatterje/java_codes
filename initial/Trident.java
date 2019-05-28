import java.util.Scanner;
class Trident
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a odd value for head");
		int head=scan.nextInt();
		System.out.println("please enter length you want");
		int length=scan.nextInt();
		System.out.println("please enter a odd value for tail");
		int tail=scan.nextInt();
		for (int i=0;i<tail+head;i++)
		{
		  for (int j=0;j<tail;j++)
		{
			if (j<=tail-i-1&&j<=i||i==tail/2)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for (int j=0;j<length;j++)
		{
			if (i==tail/2)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for (int j=0;j<head;j++)
		{
			if (i==tail/2&&j<head-2||i==tail/2-1||i==tail/2+1)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
	    }
	}
}
