public class MaxOccurrence4 {
	
	public static void main (String[] args) {
		String s="jhhjgsygggesgbbbbbd";
		int count=0,index=0;
		String s1="";
		char ar[]=new char[s.length()];
		int arr[]=new int[s.length()];
		for(int i=0;s.length()>0;i++)
		{
			ar[i]=s.charAt(0);
			s1=s.replace(""+s.charAt(0),"");
			arr[i]=s.length()-s1.length();
			s=s1;
			if(arr[i]>count)
			{
				count=arr[i];
				index=i;
			}
		}
		System.out.println(ar[index]+""+count);
	}
}

