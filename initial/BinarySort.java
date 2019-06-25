import java.util.*;
public class BinarySort {
	
	public static void main (String[] args) {
		int arr[]={4,5,6,7,3,9,12,23,15,16,18};
		Arrays.sort(arr);
		String s[]=new String[arr.length];
		int arr1[]=new int[arr.length];
		String s2="";
		int temp=0,temp2=0;
		String temp1="";
		for(int i=0;i<arr.length;i++)
		{
			s[i]=Integer.toBinaryString(arr[i]);
			s2=s[i].replace("1","");	
			arr1[i]=s[i].length()-s2.length();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					temp1=s[j];
					s[j]=s[j+1];
					s[j+1]=temp1;
					temp2=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp2;
				}
			}
		}
		System.out.println("\n"+Arrays.toString(s)+"\n"+Arrays.toString(arr));
	}
}

