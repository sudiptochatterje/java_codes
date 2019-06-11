
public class combination {

	public static void main (String[] args) {
		String b="",str="1234";
		char temp='0';
		char[] a=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				System.out.println(a);
			}
			//System.out.println(b);
		}

	}
}
