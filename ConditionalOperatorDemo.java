public class ConditionalOperatorDemo
{
	public static void main(String[] args)
	
	{
		int age = 19;
		
		//using the conditional operator (?) 
		//System.out.printf("User %s vote", (age >= 18)? "can" : "cannot");
		
		//boolean canVOte = (age>=18);
		
		
		int totalPrice = 80000;
		int discount = (totalPrice < 5000)? 0 : 500;
		
		System.out.printf("Discount is %s NGN",discount);
		
		
	}
}