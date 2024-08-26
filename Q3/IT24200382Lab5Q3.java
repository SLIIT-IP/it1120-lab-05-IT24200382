import java.util.Scanner;

public class IT24200382Lab5Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter start date (1-31) :" );
		int date1=input.nextInt();
		
		System.out.print("Enter end date (1-31) :" );
		int date2=input.nextInt();
		
		if ( date1>date2){
			System.out.print("Error: Start date must be less than End date");
		}else{
		if ( 1>date1 || 31<date1 || 1>date1 || 31<date1){
			System.out.print("Error: Days must be between 1 and 31");
		}else{
		    double perday = 48000.00;
		    System.out.println("\nRoom charge per day: Rs.48000.00/=");
		
		    int reserved = date2-date1;
		    System.out.print("No of days reserved : " +reserved);
		    
			//add discount

		    double discountrate=0;
		
		    if (reserved>=5){
			    discountrate = 20.0/100;
		    }else if (reserved>=3){
				discountrate = 10.0/100;
		    }else{
			    discountrate = 0;
		    }
		
		    double total = perday * reserved;
		    double discount = total * discountrate;
		    double amount = total-discount;
		
		    System.out.println("\nTotal Amount to be paid : "+amount);
		    }
	    }
	}
}