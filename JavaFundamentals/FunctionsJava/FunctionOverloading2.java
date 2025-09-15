package JavaFundamentals.FunctionsJava;
import java.util.Scanner;

public class FunctionOverloading2 {

  // function to calculate sum of 2 numbers
  public static float sum(float a, float b) {
    return a + b;
  }
  // function to calculate sum of 3 numbers
  public static float sum(float a, float b, float c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    float num1 = sc.nextFloat();

    System.out.print("Enter second number: ");
    float num2 = sc.nextFloat();

    System.out.print("Enter third number: ");
    float num3 = sc.nextFloat();
    
    float sum2 = sum(num1, num2);       // calling 2-parameter method
    float sum3 = sum(num1, num2, num3); // calling 3-parameter method
    System.out.println("Sum of first 2 numbers: " + sum2);
    System.out.println("Sum of 3 numbers: " + sum3);
    sc.close();
  }
  
}




