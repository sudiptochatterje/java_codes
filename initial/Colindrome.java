import java.util.Arrays;
public class Colindrome {
	
	public static void main (String[] args) {
		String s="aaaaaabbbbb";
		String t="";
		int count=0,l=0,k=5;
		try
		{
			for(int i=0;i<s.length();i++)
			{
				System.out.println(s.charAt(i+k));
				if(s.charAt(i)==s.charAt(i+k))
				{
					k=k-2;
					count++;
					if(count==3)
					{
						i=i+count;
						count=0;
						k=5;
					}
				}
				else
				{
					System.out.println("not colindrome");
					System.exit(0);
				}
			}
			System.out.println("colindrome");
	    }
	    catch(Exception e)
	    {
			System.out.println("not colindrome");
		}
	}
}

