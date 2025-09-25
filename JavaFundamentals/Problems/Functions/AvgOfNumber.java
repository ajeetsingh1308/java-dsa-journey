//Question 1 : Write a Java method to compute the average of three numbers..

package JavaFundamentals.Problems.Functions;

import java.util.Scanner;

public class AvgOfNumber {

    // Method to calculate average of 3 numbers
    public static int calculateAvgOfNumber(int num1, int num2, int num3) {
        int avgNum = (num1 + num2 + num3) / 3;
        return avgNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers to calculate their average: ");
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();

        // Store the return value
        int avg = calculateAvgOfNumber(Num1, Num2, Num3);

        // Print the average
        System.out.println("The average of the numbers is: " + avg);

        sc.close();
    }
}