import java.util.Scanner;
class DataType
{
	public static void main(String[]args)
	{
		System.out.println("how many input you are going to test");
		Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
		for (int i=1;i<=n;i++)
		{
			try
			{
		    System.out.println("enter the no");
		    long a=scan.nextLong();
			System.out.println (a+"is fitted in");
			if (a<0)
			{
				if (a>=-128)
		    System.out.println("* byte");
			
			    if(a>=-32768)
			System.out.println("* short");
			
			if(a>=-2147483648)
			System.out.println("* int");

			if(a>=-9223372036854775808l)
			System.out.println("* long");
		}
		else
		{
            if (a<=127)
		    System.out.println("* byte");
		    
		    if(a<=32767)
			System.out.println("* short");
			
			if(a<=2147483647)
			System.out.println("* int");
			
			if(a<=9223372036854775807l)
			System.out.println("* long");
		}
	}
	catch(Exception e)
	{
		System.out.println(scan.next()+" this can't be fitted anywhere"); 
	
	}
}
}
}
