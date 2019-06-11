import java.util.Scanner;
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + firstName + ", " + lastName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
    private int[] testScores;
    Student(String firstName,String lastName,int idNumber,int testScores[])
    {
    	super(firstName,lastName,idNumber);
        this.testScores=testScores;
    }
    char calculate()
    {
        int a=0;
        for (int i=0;i<testScores.length;i++)
        { 
            a=a+testScores[i];
        }
        a=a/testScores.length;
        if (a>=90&&a<=100)
        return 'O';
        else if (a<90&&a>=80)
        return 'E';
        else if (a<80&&a>=70)
        return 'A';
        else if (a>=55&&a<70)
        return 'P';
        else if (a<55&&a>=40)
        return 'D';
        else
        return 'T';
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the first Name");
		String firstName = scan.next();
		System.out.println("Input the Last Name");
		String lastName = scan.next();
		System.out.println("Input the id");
		int id = scan.nextInt();
		System.out.println("how many marks you want average from");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			System.out.println("Input "+(i+1)+" marks");
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

