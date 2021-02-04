import java.util.Scanner; 

public class CheckBMI
{
	public static void main(String[] args)

	{
		Scanner input = new Scanner(System.in);
		
		String name;
		double height;
		double weight;
		double bmi;

		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.printf("Hello %s! Enter your height in meters: ", name);
		height = input.nextDouble(); // assigns input to height

		System.out.print("Enter your weight in kilograms: ");
		weight = input.nextDouble(); //assigns input to weight

		bmi = weight/(height * height);

		if (bmi < 18.5)
			System.out.printf("%s, your BMI is %s. You are underweight.", name, bmi) ;
		if (bmi >= 18.5 && bmi<= 24.9)
			System.out.printf("%s, your BMI is %s. You are normal.", name, bmi);
		if (bmi >=25 && bmi <= 29)
			System.out.printf("%s, your BMI is %s. You are overweight." , name, bmi);
		if (bmi >= 30)
			System.out.printf("%s, your BMI is %s. You are obese.");
			


		
		
	}
}