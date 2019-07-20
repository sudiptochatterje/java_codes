public class RevisionConst {
	
	public static void main (String[] args) {
		Demo1 d1=new Demo1();
		Demo d=new Demo();
		System.out.println(d.getInt()+" "+d.getString());
	}
}
class Demo
{
	private int c;
	private String k;
	public Demo()
	{
	}
	public Demo(int c)
	{
		this("Hello");
		this.c=c;
	}
	public Demo(String k)
	{
		this.k=k+" ABC";
	}
	public String getString()
	{
		return k;
	}
	public int getInt()
	{
		return c;
	}
}
class Demo1 extends Demo
{
	public Demo1()
	{
	}
}
