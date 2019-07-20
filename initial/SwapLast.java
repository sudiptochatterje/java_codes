public class SwapLast {
	
	public static void main (String[] args) {
		String s="Hi hello how are you";
		String arr[]=s.split(" ");
		String t="";
		for(int i=0;i<arr.length-1;i++)
		{
			t+=arr[i].substring(0,arr[i].length()-1)+arr[i+1].charAt(arr[i+1].length()-1)+" ";
		}
		System.out.println(t+arr[arr.length-1]);
	}
}

