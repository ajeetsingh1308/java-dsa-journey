package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Number to check whether it is prime or not: ");
    int Number = sc.nextInt(); 

    if (Number <= 1) {
      System.out.println(Number + " is not a Prime Number");
    } else if (Number == 2) {
      System.out.println(Number + " is a Prime Number");
    } else {
      boolean isPrime = true;

      for (int i = 2; i <= Math.sqrt(Number); i++) {
        if (Number % i == 0) {
          isPrime = false;
          break; // stop checking further
        }
      }

      if (isPrime) {
        System.out.println("The " + Number + " is Prime");
      } else {
        System.out.println("The " + Number + " is not Prime");
      }
    }

    sc.close();
  }
}