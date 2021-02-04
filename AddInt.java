import java.util.Scanner; 
//this means that the program uses the class "Scanner".

public class AddInt
{
	// the main method begins the execution of the java application
	
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		int number1; //first number to be added
		int number2; // second number to be added
		int sum; //sum of number1 and number2
		
		System.out.print("Enter the first integer:  "); //prompts the user for input
		number1 = input.nextInt(); //reads the first number from the user.
		
		System.out.print("Enter the second number: "); //prompt
		number2 = input.nextInt(); //reads the second number from the user
		
		sum = number1 + number2; // stores the result in sum
		
		System.out.printf("The sum of %s and %s is %s." , number1, number2, sum);
	}
}