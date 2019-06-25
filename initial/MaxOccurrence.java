public class MaxOccurrence {
	
	public static void main (String[] args) {
		String s="khkdhakhdjgdgagdfhgwavgjdvwjgdvjgaw";
		s=s+" ";
		int l='a';
		char k=0;
		String arr[]=new String[s.length()];
		n:for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(l==s.charAt(j))
				{
					arr=s.split(""+((char)l));
					k=(char)l;
					break n;
				}
		    }
		    l++;
		}
		System.out.println(k+""+(arr.length-1));
	}
}

