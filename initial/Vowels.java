import java.util.Scanner;
class Vowels
{
	public static void main(String[]args)
	{
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("input the string");
		String n=scan.nextLine();
	    String s="aeiouAEIOU";
	    for (int i=0;i<n.length();i++)
	    {
			for (int j=0;j<s.length();j++)
			{
				if(n.charAt(i)==s.charAt(j))
				count++;
			}
		}
		System.out.println(count);
    }
}
