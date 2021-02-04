import java.util.Scanner;

public class Welcome
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name?");
		String name = sc.nextLine();
		
		System.out.printf("Hello %s, welcome to Java Programming!", name);
		
	}
}