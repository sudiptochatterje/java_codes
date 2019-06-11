import java.util.Scanner;
public class Primech {
	
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int count=0,c=0;
		int n=scan.nextInt();
		for (int i=2;;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				count++;
			}
			if (count==2)
			c++;
			if (c==n)
			{
			System.out.print(i);
			break;
		    }
			count=0;
		}
		
	}
}

