package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class PrintNumber1ton {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int counter = 1;

    System.out.print("Enter the number till where you want the number to be printed: ");
    int nth_Number = sc.nextInt();

    while (counter <= nth_Number) {
      System.out.println(counter);
      counter++;
      
    }
    System.out.println("Number Printed till "+ nth_Number);
    sc.close();
  }
  
}
