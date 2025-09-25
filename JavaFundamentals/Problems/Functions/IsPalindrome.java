package JavaFundamentals.Problems.Functions;

import java.util.Scanner;

public class IsPalindrome {

  // Function to reverse a number
  public static int reverseNum(int num) {
    int rev = 0;
    while (num > 0) {
      int digit = num % 10;
      rev = rev * 10 + digit; 
      num = num / 10; 
    }
    return rev;
  }

  // Function to check if palindrome
  public static boolean checkPalindrome(int originalNum) {
    int rev = reverseNum(originalNum);
    if (originalNum == rev) {
      System.out.println("The Number is Palindrome");
      return true;
    } else {
      System.out.println("The Number is not Palindrome");
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Number to check if Palindrome: ");
    int num = sc.nextInt();

    checkPalindrome(num);

    sc.close();
  }
}