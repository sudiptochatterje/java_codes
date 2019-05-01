/*
Output

Orient
red
3000
Havells
brown
4000
*/

class Fan{
	String brand,color;
	int cost;
}
class LearnObject{
public static void main(String[]args){
	Fan f1=new Fan();
	f1.brand="Orient";
	f1.color="red";
	f1.cost=3000;
	System.out.println(f1.brand+"\n"+f1.color+"\n"+f1.cost);
	Fan f2=new Fan();
	f2.brand="Havells";
	f2.color="brown";
	f2.cost=4000;
	System.out.println(f2.brand+"\n"+f2.color+"\n"+f2.cost);
}
}