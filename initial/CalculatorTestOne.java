import java.util.Scanner;
class User{
	int condition(){
	System.out.println("for add input 1,sub 2,multiply 3,div 4");
	Scanner scan=new Scanner(System.in);
	int con=scan.nextInt();
	return con;
	}
	int usrinput1()
	{
Scanner scan=new Scanner(System.in);
System.out.println("input the first no");
int a=scan.nextInt();
return a;
	}
int userinput2(){
System.out.println("input the second no");
Scanner scan=new Scanner(System.in);
int b=scan.nextInt();
return b;
}
	}
class Calculator{	
User usr=new User();
 void calculate(){
	 Calculator calc=new Calculator();
	switch (usr.condition()){
		case 1:
		int add=calc.add();
		System.out.println(add);
		break;
		
		case 2:
		int sub=calc.sub();
		System.out.println(sub);
		break;
		
		case 3:
		int mul=calc.mul();
		System.out.println(mul);
		break;
		
		case 4:
		int div=calc.div();
		System.out.println(div);
		break;
		
		default :System.out.println("Wrong input");
		break;
	}
	
  }
	int add(){
		int c=usr.usrinput1()+usr.userinput2();
		return c;
	}
	int sub(){
		int c=usr.usrinput1()-usr.userinput2();
		return c;
	}
	int mul(){
		int c=usr.usrinput1()*usr.userinput2();
		return c;
	}
	int div(){
		int c=usr.usrinput1()/usr.userinput2();
		return c;
	}
}
public class CalculatorTestOne{
public static void main(String[]args)
{	
Calculator cal=new Calculator();
cal.calculate();
}	
}