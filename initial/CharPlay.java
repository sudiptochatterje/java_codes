import java.util.*;
public class CharPlay 
{	
	public static void main (String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		while(true)
		{
			if(n>26)
			{
				n=n-26;
				count++;
			}
		    else
			break;
		}
		for(int i=0;i<=count;i++)
		{
			System.out.print((char)(n+64));
		}
	}
}

