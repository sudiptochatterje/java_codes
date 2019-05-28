import java.util.Scanner;
class Guesser
{
	int guessNum()
	{	
	System.out.println("guesser please guess a number");
	Scanner guess=new Scanner(System.in);
	int gn=guess.nextInt();
	return gn;
    }
}
class Player
{
	int guessp;
	int guesspNum()
	{
	System.out.println("player please guess the number");
	Scanner guess=new Scanner(System.in);
	guessp=guess.nextInt();
	return guessp;
	}
}
class Umpire
{
		int p1n,p2n,p3n;                   //players number
		int gn;                           //guesser number
	      void collect_Num_From_Guesser()
		  {
		   Guesser g=new Guesser();      //Guesser object created
		   gn=g.guessNum();
		  }
	void collect_Num_From_Player()
	{
     Player p1=new Player();
	 p1n=p1.guesspNum();
	 Player p2=new Player();
	 p2n=p2.guesspNum();
	 Player p3=new Player();
	 p3n=p3.guesspNum();
	}
	void Compare()
	{
		int v=0;
		if (gn==p1n)
		{
			System.out.println("player1 wins");
			v++;
		}
		if(gn==p2n)
		{
			System.out.println("Player2 wins");
			v++;
		}
		if(gn==p3n)
		{
			System.out.println("player3 wins");
		v=v++;
		}
		if(v==0)
			System.out.println("no one wins");
	}
}
class GuesserTest
{
	public static void main(String args[])
	{
	Umpire U=new Umpire();
	U.collect_Num_From_Guesser();  //Umpir object created
	U.collect_Num_From_Player();
	U.Compare();
	}	
}
