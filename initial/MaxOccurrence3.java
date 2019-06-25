public class MaxOccurrence3 {
	
	public static void main (String[] args) {
		String s="bbbbjhhjgsygggesgd";
		int a[]=new int[26];
		String s1="abcdefghijklmnopqrstuvwxyz";
		char arr[]=s1.toCharArray();
		int index=0,count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s1.charAt(i)==s.charAt(j))
				a[i]++;
			}
			if(count<a[i])
			{
				count=a[i];
				index=i;
			}
		}
		System.out.println(arr[index]+""+count);
	}
}

