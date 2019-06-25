import java.util.*;
public class MultipleExp {
	
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("input the no");
			int n=scan.nextInt();
			n=100/n;
			System.out.println(n);
		}
		catch(InputMismatchException ip)
		{
				System.out.println("/zero");
		}
	}
}

