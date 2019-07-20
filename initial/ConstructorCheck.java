public class ConstructorCheck {
	
	public static void main (String[] args) {
		Driver d=new Driver(23);
		System.out.print(d.get());
	}
}
class Driver
{
	private int k;
	public Driver()
	{
		this.k=k;
	}
	int get()
	{
		return k;
	}
}
