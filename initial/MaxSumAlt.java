import java.util.Arrays;
public class MaxSumAlt {
	
	public static void main (String[] args) {
		int arr[]={5,1,1,5,6,7,3,4,8,9};
		int c1[]=new int[3];
		for(int i=0,k=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				c1[0]+=arr[i];
				if(k<arr.length)
				c1[2]+=arr[k];
				k=k+3;
			}
			else
			{
				c1[1]+=arr[i];
			}
		}
		Arrays.sort(c1);
		System.out.println(c1[2]);
	}
}

