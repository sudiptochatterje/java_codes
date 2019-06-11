import java.util.Scanner;
import java.math.*;
public class BigintPrime {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b=new BigInteger(n);
        boolean bool=b.isProbablePrime(1);
        if (bool)
        System.out.print("prime");
        else
        System.out.print("not prime");

        scanner.close();
    }
}

