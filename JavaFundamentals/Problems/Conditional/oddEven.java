package JavaFundamentals.Problems.Conditional;

import java.util.Scanner;

public class oddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number to check whether the number is Even or Odd: ");
    int number = sc.nextInt();

    if (number % 2 == 0) {
      System.out.println(number + " is Even");
    } else {
      System.out.println(number + " is Odd");
    }

    sc.close(); // ✅ Always good practice to close Scanner
  }
}