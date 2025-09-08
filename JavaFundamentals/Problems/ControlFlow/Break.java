package JavaFundamentals.Problems.ControlFlow;

import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    do{
      System.out.println("Enter your number: ");
      int Number = sc.nextInt();

      if( Number%10 == 0 ){
        break; 
      }
      System.out.println(Number);
      
    }while (true);
    sc.close();
  }


  
}
