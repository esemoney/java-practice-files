import java.util.Scanner;

public class CheckerBoardPattern
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int length = 1;
		int height = 0;
		int count = 1;
		
		while(length  <= 8)
		{ 
			
			
			while (count <= 8)
			{
				System.out.print("* ");
				System.out.print(" " );
				//System.out.println();
				
				count += 1;
			}
			
			length += 1;
			height += 1;
		}
		
		
		
		
		
		
	}
}