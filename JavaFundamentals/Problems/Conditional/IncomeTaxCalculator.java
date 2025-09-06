package JavaFundamentals.Problems.Conditional;
import java.util.Scanner;

public class IncomeTaxCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Income: ");
    int income = sc.nextInt();
    double tax = 0;

    if (income < 500000) {
      tax = 0;
      System.out.println("You need to pay 0% Tax");
    } else if (income <= 1000000) {
      tax = income * 0.2;
      System.out.println("You need to pay 20% Tax: " + tax);
    } else {
      tax = income * 0.3;
      System.out.println("You need to pay 30% Tax: " + tax);
    }

    sc.close();
  }
}