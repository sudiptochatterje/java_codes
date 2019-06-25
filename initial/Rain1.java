public class Rain1 
{
	static int n;
	public static void main (String[] args) {
		int a[]={1,2,3,0,1,5,3,2,1,4,2,3};
		int a1[]=new int[a.length];
		int a2[]=new int[a.length];
		System.out.println(highestNo(a));
		System.out.println(leftNo(a));
		System.out.println(rightNo(a));
	}
	static int highestNo(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			n=n>a[i]?n:a[i];
		}
		return n;
	}
	static int leftNo(int a[])
	{
		int n1=0;
		for(int i=0;i<a.length;i++)
		{
			if(i!=n)
			{
				n1=n1>a[i]?n1:a[i];
			}
			else
			break;
		}
		return n1;
	}
	static int rightNo(int a[])
	{
		int n1=0;
		for(int i=a.length-1;i>0;i--)
		{
			if(i!=n)
			{
				n1=n1>a[i]?n1:a[i];
			}
			else
			break;
		}
		return n1;
	}
}

