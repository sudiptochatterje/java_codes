public class MatrixDia {
	
	public static void main (String[] args) {
		int h1=0,k=0,h2=0,k1=0;
		int arr[][]={{1,2,3,4,5},
			         {5,6,7,8,9},
			         {4,3,2,1,6},
			         {6,5,7,4,8},
			         {7,6,4,2,7}};
        for(int i=0;i<arr.length;i++)
        {
			for(int j=0;j<=i;j++)
			{
				k+=arr[i-h1][j];
				h1++;
			}
			System.out.println(k);
			k=0;
			h1=0;
		}
		for(int i=1;i<arr.length;i++)
        {
			for(int j=arr.length-1;j>=i;j--)
			{
				k1+=arr[i+h2][j];
				h2++;
			}
			System.out.println(k1);
			k1=0;
			h2=0;
		}
	}
}

