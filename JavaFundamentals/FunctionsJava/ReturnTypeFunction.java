package JavaFundamentals.FunctionsJava;
import java.util.Scanner;

public class ReturnTypeFunction {

  public static int calculateSum(int numA, int numB){ // parameters or formal parameters
    int sum = numA + numB;
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a: ");
    int numA = sc.nextInt();
    
    System.out.print("Enter b: ");
    int numB = sc.nextInt();
    int sum = calculateSum(numA, numB);  // argumentss or actual parameters
    System.out.println("Sum is : "+sum);

    sc.close();
  }
  
  
}
