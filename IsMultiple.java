// Assignment 1

/*
2.26 (Multiples) Write an application that reads two integers, determines whether the first is a
multiple of the second and prints the result. [Hint: Use the remainder operator.]
*/

import java.util.Scanner;

public class IsMultiple
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in); // so I'm calling the input inbuilt method
		
		int number1; // the number to check if is multiple of number2
		int number2; // contains multiple 
		
		System.out.print("Enter a number:  "); //prompt
		number1 = input.nextInt(); // assigns input to number1
		
		System.out.print("Enter another number:  "); //prompt
		number2 = input.nextInt(); // assigns input to number2
		
		if (number2 % number1 == 0)
			System.out.printf("%s is a multiple of %s", number1 , number2);
		
		if (number2 % number1!= 0)
			System.out.printf("%s is not a multiple of %s" , number1, number2);
		
	}
}
