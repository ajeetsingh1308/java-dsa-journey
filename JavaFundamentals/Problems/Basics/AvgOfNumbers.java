package JavaFundamentals.Problems.Basics;
import java.util.*;


public class AvgOfNumbers {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the 3 Numbers to calculate their Average: ");

    int Number1 = scan.nextInt();
    int Number2 = scan.nextInt();
    int Number3 = scan.nextInt();
    scan.close();

    int AvgOfNumbers = (Number1 + Number2 + Number3)/3;

    System.out.println("The AVERAGE of three number is: " +AvgOfNumbers);

  }
  
}
