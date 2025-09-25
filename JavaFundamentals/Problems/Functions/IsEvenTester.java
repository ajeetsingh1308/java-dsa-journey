//Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

package JavaFundamentals.Problems.Functions;

import java.util.Scanner;

public class IsEvenTester {

  public static boolean isEven(int num){
    boolean isEvenNumber = false;
    if (num % 2 == 0) {
      isEvenNumber =  true;
    }else isEvenNumber =false;

    return isEvenNumber;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Nuber to check if they are even or not: ");
    int Number = sc.nextInt();
    boolean isEven = isEven(Number);
    System.out.println(isEven);

    sc.close();
  }
  
}
