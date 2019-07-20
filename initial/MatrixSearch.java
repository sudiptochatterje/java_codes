import java.util.Scanner;
public class MatrixSearch {
	
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int count=0,count1=0;
		char [][]arr={{'F','A','C','I'},
			          {'O','B','Q','P'},
			          {'A','N','O','B'},
			          {'M','A','S','S'}};
			for(int j=0;j<arr.length;j++)
			{
				if(arr[0][j]==s.charAt(0))
				{
					for(int i=0;i<arr.length;i++)
					{
						if(arr[i][j]==s.charAt(i))
						count1++;
					}
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i][0]==s.charAt(0))
				{
					for(int j=0;j<arr.length;j++)
					{
						if(arr[i][j]==s.charAt(j))
						count++;
					}
				}
			}
			if(count1==s.length())
			System.out.println("true");
			else if(count==s.length())
			System.out.println("true");
			else
			System.out.println("false");
	}
}

