class Sorting
{
public static void main(String[]args)
{
	String s="madam";
	char []ar=s.toCharArray();
	for(int i=0;i<ar.length;i++)
	{
	for(int j=0;j<ar.length-1;j++)
	{
		if(ar[j]>ar[j+1])
		{
			char temp=ar[j+1];
			ar[j+1]=ar[j];
			ar[j]=temp;
			//System.out.println(ar);
		}	
	}
	
    }
    String k=new String(ar);
	System.out.println(k);
	System.out.println(45);
}
}
