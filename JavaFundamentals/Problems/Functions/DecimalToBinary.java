package JavaFundamentals.Problems.Functions;
import java.util.Scanner;

public class DecimalToBinary {
  public static void converDecimalToBinary(int decNum) {
    int pow = 0;
    int binNum = 0;
    int originalDec = decNum; // keep a copy
    
    while (decNum > 0) {
      int rem = decNum%2;
      binNum = binNum + (rem * (int) Math.pow(10, pow));
      pow++;
      decNum = decNum / 2;
    }
    
    System.out.println("Binary of " + originalDec + " is: " + binNum);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the Decimal number to convert it into Binary: ");
    int decNum = sc.nextInt();
    
    converDecimalToBinary(decNum); // updated call
    sc.close();
  }
  
}




