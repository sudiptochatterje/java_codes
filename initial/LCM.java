public class LCM {
	
	public static void main (String[] args) {
		long []arr={4,5,6,8,9,3};
		long l=100000000,h=1,l1=0;
		for(int i=0;i<arr.length;i++)
		{
			h*=arr[i];
			l=l<arr[i]?l:arr[i];
		}
		for(long i=l;i<=h;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				l1=l1>i%arr[j]?l1:i%arr[j];
			}
			if (l1==0)
			{
				System.out.println(i);
				break;
		    }
			l1=0;
		}
	}
}

