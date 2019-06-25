public class ConstTest {
	
	public static void main (String[] args) {
		TestConst t=new TestConst(1,2);
	}
}
class TestConst
{
	private int a;
	private TestConst()
	{
		a=20;
	}
	TestConst(int a1,int a2)
	{
		this();
		System.out.println(a);
	}
}
