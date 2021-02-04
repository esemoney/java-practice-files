// Program to echo whatever the user inputs
import java.util.Scanner;

public class SentinelRepetition1
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type something or 'exit' to quit");
		String input = sc.nextLine();
		
		while(!input.equalsIgnoreCase("exit"))
		{
			System.out.println(">>" + input);
			
			System.out.println("Type anything or 'exit' to quit");
			input = sc.nextLine();
			
		}
		
		System.out.print("\n Program exiting...");
			
	}
}