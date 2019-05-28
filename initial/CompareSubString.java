import java.util.Scanner;
class CompareSubString {
public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	System.out.println("input the String");
	String s=scan.nextLine();
	System.out.println("input the substring length");
	int k=scan.nextInt();
        String l=null,m=null,smallest=s.substring(0,k),largest=s.substring(0,k);
        for (int i=0;i<=s.length()-k;i++)
        {
         l=s.substring(i,k+i);
            smallest=l.compareTo(smallest)<0?l:smallest;
        }
        System.out.println("smallest substring for length "+k+"\n"+smallest);
        for (int i=0;i<=s.length()-k;i++)
        {
            m=s.substring(i,k+i);
            largest=m.compareTo(largest)>0?m:largest;
        }
        System.out.println("largest substring for length "+k+"\n"+largest);
    }
}
