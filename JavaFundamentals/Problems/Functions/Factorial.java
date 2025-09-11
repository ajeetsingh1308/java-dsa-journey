package JavaFundamentals.Problems.Functions;
import java.util.Scanner;

public class Factorial {

  public static int FactorialOfNumber(int num){
    int factorial = 1;

    for(int i= 1; i <= num; i++){
      factorial = factorial * i;
    }
    
    return factorial;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number to get the Factorial: ");
    int num = sc.nextInt();

    int factorial = FactorialOfNumber(num);
    System.out.println("The Factorial of "+num +" is : " +factorial);
    sc.close();
  }
  
}
