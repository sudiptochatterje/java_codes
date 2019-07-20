import java.util.*;
public class CopyBwIndex {
	
	public static void main (String[] args) {
		int arr1[]={1,2,5,4,3,6,5};
		int arr2[]={7,5,6,9,5,6,2};
		int copyindex=3,j=0;;
		int arr3[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr3.length;i++)
		{
			if(i<copyindex)
			arr3[i]=arr1[i];
			else if(j<arr2.length)
			arr3[i]=arr2[j++];
			else
			arr3[i]=arr1[copyindex++];
		}
		System.out.println(Arrays.toString(arr3));
	}
}

