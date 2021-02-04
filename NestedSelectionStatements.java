import java.util.Scanner;

public class NestedSelectionStatements
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a state in Nigeria: ");
		String state = sc.nextLine();
		
		if(state.equals("Rivers"))
			System.out.print("Treasure base of the nation");
		
		else if (state.equals("Lagos"))
			System.out.print("Center of Excellence");
		
		else if (state.equals("Bayelsa"))
			System.out.print("Glory of all lands");
		else
			System.out.print("Welcome to Nigeria! NEPA nor dey too bring light.");
	}
}