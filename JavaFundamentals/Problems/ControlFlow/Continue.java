package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class Continue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    do {
      System.out.print("Enter the Number (0 to exit): ");
      int Number = sc.nextInt();

      if (Number == 0) {
        System.out.println("Exiting...");
        break; // stop loop
      }

      if (Number % 10 == 0) {
        continue; // skip printing
      }

      System.out.println("The Number was: " + Number);
    } while (true);
    
    sc.close();
  }
}