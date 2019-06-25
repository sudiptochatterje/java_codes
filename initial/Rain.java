import java.util.*;
public class Rain 
{
	public static void main (String[] args) 
	{
		int a[]={1,2,3,0,1,5,3,2,1,4,2,3};
		int a1[]=a.clone();
		int c=0;
		int arr[]=new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
			if(a[a.length-i-1]>=a[a.length-j-1])
			{
				System.out.println(a[a.length-i-1]-a[a.length-j-1]);
			}
			else
			{
				//c=j+1;
				//System.out.print(c);
			    break;
		    }
		    }
		}
	}
}
