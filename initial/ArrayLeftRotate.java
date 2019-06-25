import java.util.Scanner;
public class ArrayLeftRotate {
	
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
		int temp=0;
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(j==0)
                {
                    temp =a[a.length-1];
                    a[a.length-1]=a[j];
                }
                else
                a[j-1]=a[j];
            }
            a[a.length-2]=temp;
        }
	}
}

