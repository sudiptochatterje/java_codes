class Heart
{
	int heartbeat;
	String feel; 
	public Heart(int heartbeat,String feel)
	{
		this.heartbeat=heartbeat;
		this.feel=feel;
	}
	public int getHeartbeat()
	{
		return heartbeat;
	}
	public String getFeeling()
	{
		return feel;
	}
}
class Brain
{
	int weight;
	String colour;
	public Brain(int weight,String colour)
	{
		this.weight=weight;
		this.colour=colour;
	}
	public int getWeight()
	{
		return weight;
	}
	public String getColour()
	{
		return colour;
	}
}
class Bike
{
	int cc;
	String colour;
	public Bike(int cc,String colour)
	{
		this.cc=cc;
		this.colour=colour;
	}
	public int getCc()
	{
		return cc;
	}
	public String getColour()
	{
		return colour;
	}
}
class Book
{
	int page;
	String subject;
	public Book(int page,String subject)
	{
		this.page=page;
		this.subject=subject;
	}
	public int getPage() {
		return page;
	}
	public String getSubject()
	{
		return subject;
	}
}
class StudentMain
{
	Heart he=new Heart(75,"happy");//passing parameters to constructor
	Brain ba=new Brain(1300,"gray");//passing parameters to constructor
	public void hasA(Bike b)
    {
		System.out.println("bike cc is: "+b.getCc());
		System.out.println("bike colour is: "+b.getColour());
	}
public void hasA(Book b)
{
	System.out.println("no of pages are: "+b.getPage());
	System.out.println("Subject is: "+b.getSubject());
}
}
public class StudentLaunch {

	public static void main(String[]args)
	{
		System.out.println("Directly Access Data without using StudentMain\n");
		Bike b1=new Bike(400,"Black");
		System.out.println("bike cc is: "+b1.getCc());//direct access
		System.out.println("bike colour is: "+b1.getColour());//direct access
		Book b2=new Book(300,"Physics");
		System.out.println("no of pages are: "+b2.getPage());//direct access
		System.out.println("Subject is: "+b2.getSubject());//direct access
		StudentMain s=new StudentMain();
		System.out.println("\nData Access Through StudentMain\n");
		s.hasA(b1);//access through studentMain
		s.hasA(b2);//access through studentMain
		System.out.println("beats per min are: "+s.he.getHeartbeat());
		System.out.println("feeling now: "+s.he.getFeeling());
		System.out.println("Weight of brain in gram: "+s.ba.getWeight());
		System.out.println("brain colour: "+s.ba.getColour());
	}
}

