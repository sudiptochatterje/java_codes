import java.util.*;
public class CountCon {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int k=0,l=0,count=0,d=0;
        int []o=new int [32];
        int n = scanner.nextInt();
        if(n!=0)
        {
        for (int i=0;i<32;i++)
        {
            k=n%2;
            l=n/2;
            n=l;
            o[i]=k;
        }
            for (int i=0;i<32;i++)
            {
                if(o[i]==1)
                {
                count++;
                }
                else
                {
                    d=count>=d?count:d;
                    count=0;
                }
            }
            System.out.print(d);
        }
    }
}
