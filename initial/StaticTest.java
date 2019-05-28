import java.util.Scanner;
class StaticTest {
static int H,B,area;
static boolean flag;
static{
Scanner scan=new Scanner(System.in);
H=scan.nextInt();
B=scan.nextInt();
if (H>=0&&B>=0)
flag=true;
else
System.out.println("java.lang.Exception: Breadth and height must be positive");
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
