import java.util.*;
public class StingMaven {
	
	public static void main (String[] args) {
		String s="Java Language Concept Video Tutorial and";//9BlogsJava 11andLanguage 15TutorialConcept 5Video
		int h=0,count=0;
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		String arr[]=new String[count+1];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]="";
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			arr[h]+=s.charAt(i);
			else
			h++;
		}
		if(arr.length%2==0)
		{
			for(int i=0;i<arr.length/2;i++)
			{
				t+=(arr[i].length()+arr[arr.length-i-1].length())+arr[arr.length-i-1]+arr[i]+" ";
			}
			System.out.println(t);
	    }
	    else
	    {
	        for(int i=0;i<arr.length/2;i++)
			{
				t+=(arr[i].length()+arr[arr.length-i-1].length())+arr[arr.length-i-1]+arr[i]+" ";
			}
			System.out.println(t+(arr[arr.length/2]).length()+(arr[arr.length/2]));
		}
	}
}

