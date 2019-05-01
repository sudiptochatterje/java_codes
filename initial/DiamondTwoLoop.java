/*output for 5
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
*/
import java.util.Scanner;
public class DiamondTwoLoop{
	public static void main(String arg[]){
	
		int n,store_org;
		int count=2;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
		DiamondTwoLoop obj=new DiamondTwoLoop();
        n = s.nextInt();
		store_org=n;
		
		for(int i=1;i<n+1;i++){
			obj.abc(store_org);
			store_org--;
			obj.abc2(i*2-1);
			System.out.println();
		}
		
		for(int j=1;j<n;j++){
			obj.abc(count);
			count++;
			obj.abc2(2*(n-j)-1);
			System.out.println();	
			
		}
	}
	
	
	void abc(int space){
		if(space==0)
			return;
		System.out.print(" ");
		
		abc(--space);
	}
	
	
	void abc2(int star){
		if (star==0)
			return;
		System.out.print("*");
		
		abc2(--star);
	}
}