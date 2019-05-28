import java.util.Scanner;
class Testxab
{
	Scanner scan=new Scanner(System.in);
	 int []b=new int[25];
	 int []c=new int[25];
	public static void main(String[]args)
	{
		
		System.out.println("length of your input");
		int n=scan.nextInt();
		System.out.println("please pass input");
		int []a=new int[n];
		for (int i=0;i<n;i++)
		a[i]=scan.nextInt();
		{
			for (int j=0;j<26;j++)
			b[j]=scan.nextInt();
			c[j]=scan.nextInt();
			if(97-a[i]==c[i]);
            b[i]++;
		}
	}
}
