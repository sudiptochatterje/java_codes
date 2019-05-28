import java.io.*;
import java.util.*;
class HasNextTest {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i=1;scan.hasNext()==true;i++)
        {
            String str=scan.nextLine();
            System.out.println(i+" "+str);
        }
    }
}
