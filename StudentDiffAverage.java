import java.util.Scanner;

public class StudentDiffAverage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int scoreCount = 0;
		
		System.out.printf("Enter score %d or '-1' to quit:  ", scoreCount + 1);
		int score = sc.nextInt();
		
		while(score != -1)
		{
			total = total + score;
			scoreCount += 1; 
			
			System.out.printf("Enter score %d :", scoreCount + 1);
			score = sc.nextInt();
		}
		
		if (scoreCount > 0)
		{
			double average = (double) total / scoreCount;
			System.out.printf("The average score is %.2f%n", average);
			
		}
		
		else
		{
			System.out.println("No scores were entered.");
		}
	}
}