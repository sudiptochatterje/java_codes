import java.util.*;
public class UberChallenge1 
{
	
	public static void main (String[] args) 
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the "+(i+1)+"elements");
			a[i]=scan.nextInt();
		}
		int a1[]=a.clone();
		int c=1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=1;
			for(int j=0;j<a.length;j++)
			{
				c*=a[j];
			}
			System.out.print(c+" ");
			a=a1.clone();
			c=1;
		}
	   }
	   catch(InputMismatchException e)
	   {
		   System.out.println("wrong input ##a$$&& Please enter a integer value");
	   }
	}
}

