// *****
// ****
// ***
// **
// *

package JavaFundamentals.Problems.Pattern;

import java.util.Scanner;

public class pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of row: ");
    int row_n =sc.nextInt();
    
    // for(int i= 1; i<=4; i++ ){
    //   for(int j=4; j>=i; j--){
    //     System.out.print("*");
    //   }
    //   System.err.println();
    // }

    for(int line=1; line<=row_n; line++){
      for(int star=1; star <=row_n-line+1; star++ ){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
  
}
