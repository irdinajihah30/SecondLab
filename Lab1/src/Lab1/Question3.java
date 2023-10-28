package Lab1;
import java.util.Scanner;

public class Question3{

public static void main(String []args){

   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter number 1: ");
   int num1 = scan.nextInt();

   System.out.println("Enter number 2: ");
   int num2 = scan.nextInt();
   
   //process math operation
   int sum = num1 + num2;
   int differ = num1 - num2;
   int product = num1 * num2;
   int divide = num1 / num2;
   int remainder = num1 % num2;

   System.out.println("Total Sum is " + sum);
   System.out.println("Total different is " + differ);
   System.out.println("Total product is " + product);
   System.out.println("Total qoutient of division is " + divide);
   System.out.println("Total remainder of division is " + remainder);
    }

}