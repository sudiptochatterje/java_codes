import java.util.Scanner;
class RemoveChar
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input String");
		String s=scan.nextLine();
		String t="";
		for (int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				
			}
			else
			{
			t=t+s.charAt(i);
		    }
		}
		System.out.println(t);
	}
}
