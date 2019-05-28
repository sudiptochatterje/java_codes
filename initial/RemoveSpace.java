import java.util.Scanner;
class RemoveSpace {
public static void main(String[]args){
	int a=0,b=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("input the main String");
	String s=scan.nextLine();
        for (int i=0;i<s.length();i++)
        {
			if (s.charAt(i)!=' ')
			{
				a=i;
				break;
			}
        }
        for (int j=s.length()-1;j>=0;j--)
        {
			if (s.charAt(j)!=' ')
			{
				b=j;
				break;
			}
        }
        String s1=s.substring(a,b+1);
        s1=s1.replaceAll("[ ]+"," ");//replace more than one space with one
        System.out.println(s1);
    }
}
