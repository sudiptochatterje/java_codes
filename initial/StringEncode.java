import java.util.Scanner;
import java.lang.*;
import java.io.*;
class StringEncode
{
	public static void main (String[] args) throws java.lang.Exception
	{
      String t="";
	   Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
        s=s.toLowerCase();
        char []s1=s.toCharArray();
		for(int i=0;i<s.length();i++)
        {
          if(s1[i]>='a'&&s1[i]<='x')
          {
            s1[i]=((char) (s1[i]+2));
          t=t+s1[i];
          }
           else if (s1[i]=='y')
           {
               s1[i]='a';
             t=t+s1[i];
           }
            else
            {
              s1[i]='b';
              t=t+s1[i];
            }
            
        }
      t=t.toUpperCase();
      System.out.println(t);
	}
}

