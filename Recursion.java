import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";
		
		int input = 0;

		while (choice.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter a number to get its factorial.");
			
			input = scan1.nextInt();
			scan1.nextLine();
			
			System.out.print("The factorial of " + input + " is ");

			System.out.println(getFactorial(input));

			System.out.println("Continue?");

			choice = scan1.nextLine();
		}
		
		System.out.println("Goodbye!");
		
		scan1.close();
	}

	public static long getFactorial(int input) {
		
		if (input == 1) return 1;
		
		return input * getFactorial(input-1); //this is recursion
	}
}
