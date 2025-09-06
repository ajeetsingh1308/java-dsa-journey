package JavaFundamentals.Problems.Conditional;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Number1: ");
    int Num1 = sc.nextInt();
     System.out.print("Enter the Number1: ");
    int Num2 = sc.nextInt();

    System.out.print("Enter the Arithmetic Operator for Calculation: ");
    char operator = sc.next().charAt(0);

    switch(operator){
      case '+':
      System.out.println(Num1 + Num2);
      break;
      case '-':
      System.out.println(Num1 - Num2);
      break;
      case '*':
      System.out.println(Num1 * Num2);
      break;
      case '/':
      System.out.println(Num1 / Num2);
      break;
      case '%':
      System.out.println(Num1 % Num2);
      break;
      default:
      System.out.println("Not valid operation for this operator designed");

    }
    sc.close();
  }
  
}
