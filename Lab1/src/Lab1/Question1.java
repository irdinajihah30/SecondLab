package Lab1;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Enter your weight(kgs): ");

		   double kg = scan.nextDouble();
		   final double lbs = 2.2;
		   double total = kg * lbs;
		   
		   System.out.println("your weight(lbs): " + total);
	}

}
