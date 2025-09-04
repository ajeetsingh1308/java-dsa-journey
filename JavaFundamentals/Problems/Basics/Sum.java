package JavaFundamentals.Problems.Basics;

import java.util.*;

public class Sum { 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in)  ;

    System.out.print("Enter two numbers to find their sum: ");
    int Number1 = scan.nextInt();
    int Number2 = scan.nextInt();
    scan.close();
    int Sum = (Number1 + Number2);

    System.out.println("The Sum is : " +Sum);

  }
  
}