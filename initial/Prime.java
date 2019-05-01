import java.util.Scanner;
import java.lang.Math;
public class Prime
{
	public static void main(String args[])
	{
		boolean at=true;
		System.out.println("please enter the no");
		Scanner obj=new Scanner(System.in);
		int number = obj.nextInt();
		for (int i=2;i<=Math.sqrt(number);i++)
		{
			if (number % i == 0)
			{
	      at=false;
	      break;
	        }
	    }
	if(at)
	   System.out.println(number + " is a Prime Number");
	else
	   System.out.println(number + " is not a Prime Number");
	}
}