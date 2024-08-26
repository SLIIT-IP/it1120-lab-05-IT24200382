import java.util.Scanner;

public class IT24200382Lab5Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int num = input.nextInt ();
		
		String prize;
		if (num >= 5) {
			prize = "Prize is a : Headphone";
		}else if (num >= 4 ){
			prize = "Prize is a : Travelling Chair";
		}else if (num >= 3){
			prize = "Prize is a : Bag";
		}else if (num >= 2){
			prize = "Prize is a : Umbrella";
		}else if (num >= 1){
			prize = "Prize is a : Pen";
		}else if (num<0) {
			prize = "Input must be a number 0 or greater";
		}else{
			prize = "No Prize";
		}
		System.out.println("" +prize);
		
	}
}