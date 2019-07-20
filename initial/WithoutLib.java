import java.util.*;
public class WithoutLib {
	
	public static void main (String[] args) {
		char arr[]={'h','h','d','a','k','d','b','k','a','k'};
		char temp=' ';
		String t="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
			}
			else
			t+=arr[i];
		}
		System.out.println(t+arr[arr.length-1]);
	}
}

