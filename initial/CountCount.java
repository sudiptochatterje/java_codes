public class CountCount {
	
	public static void main (String[] args) 
	{
		String s="this is my class";
		s=s.replace(" ","");
		s=s+" ";
		for(int i=0;s.length()>1;i++)
		{
		    String arr[]=s.split(""+s.charAt(0));
		    System.out.println(""+s.charAt(0)+""+(arr.length-1));
		    s="";
		    for(int j=0;j<arr.length;j++)
		    {
		     if(arr[j]!="")
		     s=s+arr[j];
		    }
	    }
	}
}
