package JavaFundamentals.Problems.Functions;

import java.util.Scanner;

public class SumOfTheDigit {

    // method to compute sum of digits
    public static int DigitSum(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;   // extract last digit
            sum = sum + lastDigit;      // add to sum
            num = num / 10;             // remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int result = DigitSum(number);  // store result
        System.out.println("Sum of digits: " + result);

        sc.close();
    }
}