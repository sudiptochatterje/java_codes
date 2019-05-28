import java.util.Scanner;
class Testxa{
	static int []b=new int[26];
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("please pass input");
		String str=scan.nextLine().toLower();
		
		char[] a=str.toCharArray();
		String []s={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for (int i=0;i<str.length();i++){
			 int j=a[i]-97;
			 b[j]++;
		    }
		for(int i=0;i<26;i++){
			if(b[i]!=0)
				System.out.println(b[i]+" "+s[i]);
            }	
	}
}
