public class FindMiss {
	
	public static void main (String[] args) {
		String s="3,5,9,10,14,15,19,20";
		String arr[]=s.split(",");
		String temp="";
		int count=0;
		for(int i=0;i<Integer.parseInt(arr[arr.length-1]);i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(Integer.parseInt(arr[j])==i)
			{
				count++;
			}
		    }
		    if(count==0)
		    {
		    temp=temp+" "+i;
		    }
		    count=0;
		}
		System.out.println(temp);
	}
}

