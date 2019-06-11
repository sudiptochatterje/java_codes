public class Test1 {
	
	public static void main (String[] args) {
		String s=("2th4is i4s a4 g3a2m4e");
		String[]a=s.split(" ");
		String s1="",a1="";
		int count=0,a4=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length();j++)
			{
			if(a[i].charAt(j)>='a'&&a[i].charAt(j)<='z'||a[i].charAt(j)>='A'&&a[i].charAt(j)<='Z')
			{
			count++;
			s1=s1+a[i].charAt(j);
		    }
		    else 
		    {
		    a1+=a[i].charAt(j);
		    a4=a4+Integer.parseInt(a1);
		    a1="";
		    }
		    }
		    s1=a4+s1+count;
		    count=0;
		    a4=0;
		    System.out.print(s1+" ");
		    s1="";
		}
		
	}
}

