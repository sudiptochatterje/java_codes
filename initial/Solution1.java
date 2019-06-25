import java.util.*;
public class Solution1 
{
	public static void main(String[]args)
	{
		int arr[]={1,3,5,2,4,6,7};
		int temp=0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i+1)
			{
				temp=arr[arr[i]-1];
				arr[arr[i]-1]=arr[i];
				arr[i]=temp;
				count++;
				i--;
			}
		}
		System.out.println(count);
	}
}


