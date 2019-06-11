import java.util.Scanner;
class RemoveDup
{
	public static void main (String[]args)
	{
		String s1="";
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for(int i=0;s.length()>0;i++)
		{
			s1=s1+s.charAt(0);
			s=s.replace(""+s.charAt(0),"");
		}
		System.out.print(s1);
	} 
}
