import java.util.Scanner;

public class IT24200382Lab5Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int num3 = input.nextInt();
		
		System.out.println("\nUser entered numbers are: "+num1+" "+num2+" "+num3);
		
		int large = num1;
		if (large<num2) {
			large = num2;
		}
		if (large<num3) {
			large = num3;
		}
		int small = num1;
		if (small>num2) {
			small = num2;
		}
		if (small>num3) {
			small = num3;
		}
		System.out.println("The Smallest number is: "+small);
		System.out.println("The Largest number is: "+large);
	}
}