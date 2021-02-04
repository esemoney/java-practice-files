import java.util.Scanner;

public class RepetitionStatement2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		/*
			
			this program propmts the user for 5 scores and display's the average.
			
			We use a while loop to accept input.
		
		*/
		
		int count = 1;
		int total = 0;
		
		while(count<=5)
		{
			System.out.printf("Enter score %d  ", count);
			int score = sc.nextInt();
			
			total = total + score;
			count = count + 1;
			
		}
		
		int average = total / count;
						
		System.out.printf("The average is %d. The count is %s", average, count);
	}
}