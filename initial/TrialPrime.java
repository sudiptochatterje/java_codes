import java.util.*;
import java.lang.Math;
public class TrialPrime 
{	static int value=1;

	public static void main(String args[])
	{

	int number=0;
		System.out.println("please enter the no");
		Scanner obj=new Scanner(System.in);
		try{
		number=obj.nextInt();
		}
		catch(Exception h)
		{
			value=7887;
			System.out.println("not a valid input");
		}
		
		if(number==1){
			System.out.println("not prime");
			return ;
		}
		
		 for(int i=2;i<=Math.sqrt(number);i++)
		 {
			 if (number%i==0)
				value=0;
		 }
		 
		 if(value==1)
			 System.out.println("is prime");
		 
		 else if(value==0)
			 System.out.println("not prime");
		 
	}
	
	
}