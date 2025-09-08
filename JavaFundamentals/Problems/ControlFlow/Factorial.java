package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    long fact = 1;

    System.out.print("Enter the Number to calculate its Factorial: ");
    int Number = sc.nextInt();

    for(int i=1; i <= Number; i++){

      fact = fact*i;
    }

    System.out.println("The factorial of " +Number + ": " +fact);
    sc.close();
  }
  
}
