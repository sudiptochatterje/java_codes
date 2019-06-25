import java.util.*;
public class ReplaceBin 
{
	public static void main (String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int k=0,l=0;
        int []o=new int [32];
        System.out.println("input the no");
        int n = scan.nextInt();
        int temp=0;
        String s="";
        System.out.println("input the swap position");
        int a1=scan.nextInt();
        int a2=scan.nextInt();
        try
        {
        for (int i=0;i<32;i++)
        {
            k=n%2;
            l=n/2;
            n=l;
            o[31-i]=k;
        }
        temp=o[31-a1];
        o[31-a1]=o[31-a2];
        o[31-a2]=temp;
        for(int i=0;i<o.length;i++)
        {
			s=s+o[i];
		}
		System.out.println(s);
		int m=Integer.parseInt(s,2);
		System.out.println(m);      
        }
        catch(ArithmeticException ae)
        {
			System.out.println("00000000000000000000000000000000");
			System.out.println(0);
		}
	}
}
