public class MaxOccurrence2 {
	
	public static void main (String[] args) {
		String s="kggkhgyjglgkliuuikbjljguiui";
		int count=0;
		char a=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			a=a>s.charAt(i)?s.charAt(i):a;
		}
		for(int i=0;i<s.length();i++)
		{
			if(a==s.charAt(i))
			count++;
		}
		System.out.println(a+""+count);
	}
}

