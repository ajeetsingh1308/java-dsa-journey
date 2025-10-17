package JavaFundamentals.Problems.Pattern;

import java.util.Scanner;

public class HollowRectangle {

  public static void Hollow_Pattern(int noOfRows, int noOfCol) {

    for (int i = 1; i <= noOfRows; i++) {
      // outer loop
      for (int j = 1; j <= noOfCol; j++) {
        if (i == 1 || i == noOfRows || j == 1 || j == noOfCol) {
          System.out.print("* ");
        } else {
          System.out.print("  "); // two spaces to align with "* "
        }
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of Rows you want for the rectangle: ");
    int totalRow = sc.nextInt();
    System.out.print("Enter the Number of Columns you want for the rectangle: ");
    int totalCol = sc.nextInt();

    Hollow_Pattern(totalRow, totalCol);

    sc.close();
  }

}