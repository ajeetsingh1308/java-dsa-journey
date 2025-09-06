package JavaFundamentals.Problems.Conditional;

import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 3 Numbers: ");
    int number1 = sc.nextInt();
    int number2 = sc.nextInt();
    int number3 = sc.nextInt();

    if (number1 > number2 && number1 > number3) {
      System.out.println(number1 + " is greater among 3 numbers");
    } else if (number2 > number3) {
      System.out.println(number2 + " is greater among 3 numbers");
    } else {
      System.out.println(number3 + " is greater among 3 numbers");
    }

    sc.close();
  }
}