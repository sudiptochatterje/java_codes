import java.util.Scanner;
class Assignment {
public static void main(String[]args){
	int count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("input the main String");
	String s=scan.nextLine();
	System.out.println("input the substring");
	String s1=scan.nextLine();
		int k=s1.length();
        String l=null;
        for (int i=0;i<=s.length()-k;i++)
        {
         l=s.substring(i,k+i);
            if(l.compareTo(s1)==0)
            {
				count++;
			}
        }
        System.out.println("maxium occurrence of substring :"+s1+" "+count);
    }
}
