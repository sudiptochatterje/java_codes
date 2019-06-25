import java.util.Scanner;
class User extends Exception
{
    public String getMessage()
    {
        return "Either Acc no or Password is incorrect";
    }
}
class ATM
{
    private int acc_no=12345;
    private int pass=54321;
    private int pw,acc;
    public void userInput()
    {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Account number");
        acc=scan.nextInt();
        System.out.println("Enter the password");
        pw=scan.nextInt();
            
    }
    public void verify()throws Exception
    {
        if (acc_no==acc && pass==pw)
        {
            System.out.println("transaction complete Count your money before leave");
        }
        else
        {
            User u=new User();
            System.out.println(u.getMessage());
            throw u;
        }
    }
}
class Bank
{
    public void processing()
    {
        ATM atm=new ATM();
        try
        {
            atm.userInput();
            atm.verify();
        }
        catch (Exception e)
        {
			System.out.println("two attempts remaining");
            try
            {
                atm.userInput();
                atm.verify();
            }
            catch (Exception h)
            {
				System.out.println("one attempt remaining");
                try
                {
                    atm.userInput();
                    atm.verify();   
                }
                catch (Exception g)
                {
                    System.out.println("Card blocked contact your bank for further procedure");
                    System.exit(0);
                }
            }
        }
    }
}
class CustomException
{
    public static void main(String args[])
    {
        Bank b=new Bank();
        b.processing();
    }
}

