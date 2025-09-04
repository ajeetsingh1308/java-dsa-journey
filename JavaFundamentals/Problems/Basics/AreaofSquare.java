
package JavaFundamentals.Problems.Basics;

import java.util.Scanner;

public class AreaofSquare {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the side of SQUARE: ");

    float side = scan.nextFloat();

    float AreaOfSquare = (side * side);
    scan.close();

    System.out.println("The Area of SQUARE is: " +AreaOfSquare);

  }
  
}
