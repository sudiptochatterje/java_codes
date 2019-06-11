import java.util.Arrays;
import java.util.Scanner;
public class Combination 
{
		public static void main (String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the no you want combination of");
			int n=scan.nextInt();
			int n1=n,count=0;
			String s=""+n;
			char a2[]=s.toCharArray();
			int k=1;
			for(int i=1;k==1;i++)
			{
			if(n<Math.pow(10,(s.length())))
			{
				n++;
				if(checkFn(n,a2)==true)
				{
					count++;
				    System.out.println(n);
				}
			}
			else
			break;
		    }
		    for(int j=1;true;j++)
			{
			if(n1>Math.pow(10,(s.length()-1)))
			{
				n1--;
				if(checkFn(n1,a2)==true)
				{
					count++;
				    System.out.println(n1);
			    }
			}
			else
			break;
			}
			System.out.println("no of combination is"+(count+1));
		}
	public static boolean checkFn(int n,char a2[])
		{
			String s1=""+n;
			char []a=s1.toCharArray();
			Arrays.sort(a);
			Arrays.sort(a2);
			return Arrays.equals(a,a2);
		}
}

