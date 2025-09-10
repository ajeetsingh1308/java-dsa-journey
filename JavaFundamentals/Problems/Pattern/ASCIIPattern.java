package JavaFundamentals.Problems.Pattern;

import java.util.Scanner;

public class ASCIIPattern {
  public static void main(String[] args) {
    char ch ='A';
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int row_no = sc.nextInt();


    for(int line = 1; line <= row_no; line++){
      for( int chars =1; chars <=line; chars++){
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
    sc.close();
  }

  
  
}
