import java.util.Scanner;
class Multiple{
	public static void main(String[]args)
	{
		int c;
		System.out.println("please input a no you want multiple of");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=1;i<=10;i++)
		{
		c=n*i;
		System.out.println(n+"*"+i+"="+c);
	    }
	}
}
