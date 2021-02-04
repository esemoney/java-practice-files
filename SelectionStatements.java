import java.util.Scanner;

//A for loop in python does an action for each item in a list (or more precisely, in an iterable). Similar to sentinel controlled repetition.

//A while loop will keep executing so long as the condition after the while is True.

public class SelectionStatements
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your score: ");
		
		int score = sc.nextInt();
		
		if(score >= 45)
			System.out.println("Congrats! You've passed.");
		
		else
		{
			System.out.println("Sorry, you didn't make the cut.");
			System.out.println("Please apply to retake the examination.");
		}
			
		
	}
}