import java.lang.Math; 
import java.util.Scanner;
class SeriesOne
{
	public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("how many sets of input you have");
	int q=scan.nextInt();
	for (int j=1;j<=q;j++)
	{
	System.out.println("value of a");
	int a=scan.nextInt();
	System.out.println("value of b");
	int b=scan.nextInt();
	System.out.println("value of n");
	int n=scan.nextInt();
	int c=0;
	for (int i=0;i<n;i++)
	{
		double d=Math.pow(2,i)*b+c;
		int g=(int)d;
	    c=g;
	System.out.print(a+c+" ");
    }
}
}
}
