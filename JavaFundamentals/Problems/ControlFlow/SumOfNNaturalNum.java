package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class SumOfNNaturalNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int counter = 1;
    int sum = 0;

    System.out.print("Enter the number till where you want the sum of first n natural Number: ");
    int n = sc.nextInt();

    while (counter <= n) {
      sum = sum + counter ;
      counter ++;
      
    }
    System.out.println("The Sum of n natural number is: "+ sum);
    sc.close();
  }
  
}
