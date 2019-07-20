public class StaticRevision {
	
	public static void main (String[] args) {
		Demo1 d=new Demo1();
		d.k=-3;
		d.a=5;
		System.out.println(Demo1.solve());
		d.value();
	}
}
class Demo1
{
	static int a,k;
	static
	{
		System.out.println("Static"+a+" "+k);
		if(a+k==2)
		a=4;
	}
	static int solve()
	{
		System.out.println("solve"+a+" "+k);
		return a*5;
	}
	void value()
	{
		System.out.println("value"+a+" "+k);
		a=5;
		if(a+k==2)
		a=1;
		System.out.println(a);
	}
}
