/*
2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]
*/

import java.util.Scanner;

public class GetInt
{
	
	public static void main(String[] args)
	
	{
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int sum;
		int average;
		int product;
		int smallest;
		int largest;
		
		
		System.out.print("Enter a number: ");
		number1 = input.nextInt();

		System.out.print("Enter a second number: ");		
		number2 = input.nextInt();

		System.out.print("Enter a third number: ");
		number3 = input.nextInt();
		

		
		sum = number1 + number2 + number3; // checks for sum
		average = ((number1 + number2 + number3)/3); // checks for average
		product = number1 * number2 * number3; // checks for product
		
		
		// to check for smallest
		if (number1 <= number2 && number1 <= number3)
			smallest = number1;
		else if (number2 <= number1 && number2 <= number3)
			smallest = number2;
		else
			smallest = number3;
		
		
		// to check for largest
		if (number1 > number2 && number1>number3)
			largest = number1;
		else if( number2 > number3 )
			largest = number2;
		else
			largest = number3;
		
		
		
		System.out.printf("Hello! The sum of %s , %s , and %s is %s. Their average is %s. Their product is %s. %s is the smallest and %s is the largest." , number1, number2, number3, sum, average, product, smallest, largest);
	}
}