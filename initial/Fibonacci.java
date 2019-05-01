import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("plz enter the no ");
int number = sc.nextInt();
 int num1 = 1, num2 = 1;
        System.out.println("Fibonacci Series of "+number+" numbers:");

        for (int i = 1; i <= number; ++i)
        {
            System.out.println(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
}
}
