package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class ReverseNumber {
  // public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);

  //   System.out.print("Enter the Number to Reverse: ");
  //   int Number =sc.nextInt();

  //   while(Number > 0){
  //     int lastDigit = Number % 10;
  //     System.out.print(lastDigit);
  //     Number = Number/10;
  //   }
  //   System.out.println();
  //   sc.close();
  // }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int revNumber=0;

    System.out.print("Enter the Number to Reverse: ");
    int Number =sc.nextInt();

    while(Number > 0){
      int lastDigit = Number % 10;
      revNumber =(revNumber*10+lastDigit);
      Number = Number/10;
    }
    System.out.print(revNumber);
    System.out.println();
    sc.close();
  }
  
}
