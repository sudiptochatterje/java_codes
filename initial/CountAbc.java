import java.util.Scanner;
class CountAbc
{
	static int []a=new int[26];
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char[] c=s.toCharArray();
		char[] b=s.toCharArray();
		for (int i=0;i<s.length();i++)
		{
			for (int j=0;j<s.length();j++)
			{
				if (c[i]==b[j])
				{
					if(b[j]!='0')
					a[i]++;
					b[j]='0';
				}
			}
		}
for (int k=0;k<s.length();k++)
			{
				if (a[k]!=0)
				System.out.println(a[k]+" "+c[k]);
			}
	}
}
