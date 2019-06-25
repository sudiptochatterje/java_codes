import java.io.*;
import java.util.*;

public class BitWiseTest {
    BitWiseTest p = new BitWiseTest();
    char s[]=p.s.clone();
    void pushCharacter(char c)
    {
        for(int i=s.length-1;i>=0;i--)
        {
            s[i]=c;
        }
    }
    void enqueueCharacter(char d)
    {
        for(int i=0;i<s.length;i++)
        {
            s[i]=d;
        }
    }
    char popCharacter()
    {
        for(int i=0;i<s.length;i++)
            return s[i];
            return 'w';
    }
    char dequeueCharacter()
    {
        for(int i=0;i<s.length;i++)
            return s[i];
            return 'q';
    }
    // Write your code here.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        BitWiseTest p = new BitWiseTest();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

