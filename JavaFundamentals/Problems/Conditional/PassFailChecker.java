package JavaFundamentals.Problems.Conditional;

import java.util.Scanner;

public class PassFailChecker {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Marks: ");
    int marks = sc.nextInt();

    // Using ternary operator directly
    System.out.println(marks >= 33 ? "You Passed the Exam 🎉" : "You Failed the Exam ❌");

    sc.close();
  }
}