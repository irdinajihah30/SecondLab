package Lab1;
import java.util.Scanner;

public class Question4{

public static void main(String []args){

   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter your number: ");

   int num1 = scan.nextInt();
   int square = num1 * num1;
   int cube = num1 * num1 * num1;
   
   System.out.println(" Number\t" + "Square\t" + " Cube \t");
   System.out.println(" " + num1 +"\t "+ square +" \t" + cube +" ");
   }

}
