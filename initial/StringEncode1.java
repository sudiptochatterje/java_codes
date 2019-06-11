import java.lang.*;
import java.io.*;
import java.util.Scanner;
class StringEncode1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   String s="";
	   
	    Scanner sc=new Scanner(System.in);
	    
		s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++)
		s[i]=(s.charAt(i)-30);

			System.out.println(ch);
	}
} 

