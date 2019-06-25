import java.util.*;
public class UberChallenge {
	
	public static void main (String[] args) {
		int a[]={1,2,3,4,5};
		int l=a.length*(a.length+1)/2;
		int arr[]=new int[l];
		String s="";
		int c=1,d=0;
		int h=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					c*=a[k];
				}
				arr[d]=c;
				d++;
				c=1;
			}
		}
		int count=0;
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=arr[i-1])
			{
			System.out.print(arr[i]+" ");
			count++;
		    }
			if(count==a.length+1)
			break;
		}
	}
}

