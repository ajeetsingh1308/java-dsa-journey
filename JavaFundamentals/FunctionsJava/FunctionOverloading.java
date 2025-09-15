package JavaFundamentals.FunctionsJava;

import java.util.Scanner;

public class FunctionOverloading {

    // function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int sum2 = sum(num1, num2);       // calling 2-parameter method
        int sum3 = sum(num1, num2, num3); // calling 3-parameter method

        System.out.println("Sum of first 2 numbers: " + sum2);
        System.out.println("Sum of 3 numbers: " + sum3);

        sc.close();
    }
}