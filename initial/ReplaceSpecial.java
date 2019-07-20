import java.util.*;
public class ReplaceSpecial {
	
	public static void main (String[] args) {
		String s="the white tiger is bigger than the brown tiger";
		//Output:is 2 the 3 than 4 white tiger brown 5 bigger 6
		String arr[]=s.split(" ");
		String temp="",temp1="";
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j].length()>arr[j+1].length())
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			    }
			}
		}
		LinkedHashSet<String> t=new <String>LinkedHashSet();
		for(int i=0;i<arr.length;i++)
		{
			t.add(arr[i]);
		}
		String arr1[]=new String[t.size()];
		t.toArray(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}

