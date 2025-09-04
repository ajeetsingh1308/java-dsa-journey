package JavaFundamentals.Problems.Basics;
import java.util.*;

public class Product {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter two numbers to find their product: ");
    float Number1 = scan.nextFloat();
    float Number2 = scan.nextFloat();
    scan.close();

    float Product = (Number1 * Number2);

    System.out.println("The Product of two number is: " +Product);


  }
  
}
