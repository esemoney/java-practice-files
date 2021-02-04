// Assignment 1
/*(Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or e
ven. 
[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a 
remainder of 0 when divided by 2.] */

import java.util.Scanner;
public class OddOrEven
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		int number; // the number to be checked
		
		System.out.print("Please enter a number:  "); //prompts the user for input
		number = input.nextInt(); // reads the user's input and assigns it to number.
		
		if (number % 2 == 0 )
			System.out.printf("%s is an even number." , number);
			
			
		if (number % 2 != 0)
			System.out.printf("%s is an odd number." , number);
	}
}