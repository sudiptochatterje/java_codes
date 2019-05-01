//number multiply by 4
import java.util.Scanner;
public class  
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        int mul = n << 2;
        System.out.println("Answer:"+mul);
    }
}