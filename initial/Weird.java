import java.util.Scanner;
public class Weird {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        if (n%2==1)
        {
            System.out.println("Weird");
        }
if (n%2==0)
{
    if(n<=5){
    System.out.println("Not Weird");
    }
    else if(n<=20)
    {
        System.out.println("Weird");
    }
    if (n>20)
    System.out.println("Not Weird");
}
    }
}
