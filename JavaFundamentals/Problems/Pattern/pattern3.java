// 1
// 12
// 123
// 1234

package JavaFundamentals.Problems.Pattern;

import java.util.Scanner;

public class pattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int row_no = sc.nextInt();

    for(int line = 1; line <= row_no; line++){
      for( int num = 1; num <= line; num++  ){
        System.err.print(num);
      }
      System.out.println();

    }
    sc.close();
  }
  
}
