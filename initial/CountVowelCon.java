import java.util.Scanner;
class CountVowelCon
{
	public static void main(String[]args)
	{
		int count=0,count1=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("input the String");
		String s=scan.nextLine();
		String ar[]=s.split(" ");
		for (int k=0;k<ar.length;k++)
		{
			for(int j=0;j<ar[k].length();j++)
			{
				if(ar[k].charAt(j)=='a'||ar[k].charAt(j)=='e'||ar[k].charAt(j)=='i'||ar[k].charAt(j)=='o'||ar[k].charAt(j)=='u'||
				ar[k].charAt(j)=='A'||ar[k].charAt(j)=='E'||ar[k].charAt(j)=='I'||ar[k].charAt(j)=='O'||ar[k].charAt(j)=='U')
			{
				count++;
			}
			else if(ar[k].charAt(j)>='a'&&ar[k].charAt(j)<='z'||ar[k].charAt(j)>='A'&&ar[k].charAt(j)<='Z')
			{
				count1++;
			}
			}
			System.out.print(count+""+ar[k]+""+count1+" ");
			count=0;
			count1=0;
		}
	}
}
