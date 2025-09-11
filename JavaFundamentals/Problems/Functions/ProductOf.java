package JavaFundamentals.Problems.Functions;
import java.util.Scanner;


public class ProductOf {

  public static float ProductofAandB(float a, float b){

    float productOf = a * b;
    return productOf;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of a: ");
    float numA = sc.nextFloat();

    System.out.print("Enter the value of a: ");
    float numB = sc.nextFloat();

    float productOf = ProductofAandB(numA, numB);
    System.out.println("The Prodcut of two numbers are: " +productOf);


    sc.close();
  }
  
}
