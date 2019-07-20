public class StringReverse {
	
	public static void main (String[] args) {
		String s="Hello World GFG Welcomes You";//You semocleW GFG dlroW Hello
		String first="",last="",mid="";
		int i=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			first+=s.charAt(i);
			else
			break;
		}
		int j=0;
		for(j=0;j<s.length();j++)
		{
			if(s.charAt(s.length()-j-1)!=' ')
			last=s.charAt(s.length()-j-1)+last;
			else
			break;
		}
		for(int m=s.length()-j-1;m>=i;m--)
		{
			mid+=s.charAt(m);
		}
		System.out.println(last+mid+first);
	}
}

