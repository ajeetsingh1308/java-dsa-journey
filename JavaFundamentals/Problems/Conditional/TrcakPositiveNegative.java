package JavaFundamentals.Problems.Conditional;

import java.util.Scanner;

public class TrcakPositiveNegative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Number: ");
    int Number =sc.nextInt();

    if(Number>0){
      System.out.println(Number+" is Positive");
    }else if (Number < 0){
      System.out.println(Number+" is Negative");
    }else{
      System.out.println(Number+" is Neutral");
    }
    sc.close();
  }
  
}
