package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class OddEvenSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int Number;
    int Choice;
    int evenSum=0;
    int oddSum=0;

    do{
      System.out.print("Enter the Intiger: ");
      Number = sc.nextInt();

      if( Number % 2 == 0){
        evenSum +=Number;
      }else{
        oddSum += Number;
      }

      System.out.println("Do you want to Continue? Press 1 for 'yes' and 2 for 'NO'");

      Choice = sc.nextInt();

    }while(Choice == 1);


    System.out.println("The sum of even numbers are: "+ evenSum);
    System.out.println("The sum of odd numbers are: "+ oddSum);


    sc.close();
  }
  
}
