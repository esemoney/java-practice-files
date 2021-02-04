/*write a pseudocode and a java application that inputs a series of 10 integers and determines and prints the largest integer.

your program should use at least ;
counter
number
largest
*/
import java.util.Scanner;

public class LargeTen
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int count = 1; // initialize the count and largest variables
		int largest  = 0;  // initialize 
		
		
		while(count <= 2)
		{
			System.out.printf("Enter  number %s:", count);
			int number = sc.nextInt();
			
			if (count == 1)
				largest = number;
			
			if (number > largest)
				largest = number;
			
			count = count + 1;
		}
		
		System.out.printf("The largest is %s", largest);
		
	
	}
	
	
	
}