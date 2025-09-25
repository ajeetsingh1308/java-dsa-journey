package JavaFundamentals.FunctionsJava;

import java.util.Scanner;

public class MathMethodsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers (a b): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Min of a, b = " + Math.min(a, b));
        System.out.println("Max of a, b = " + Math.max(a, b));

        System.out.print("Enter a number for sqrt: ");
        double x = sc.nextDouble();
        System.out.println("sqrt(" + x + ") = " + Math.sqrt(x));

        System.out.print("Enter base and exponent: ");
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        System.out.println(base + " ^ " + exponent + " = " + Math.pow(base, exponent));

        // average of a and b
        double avg = (a + b) / 2.0;
        System.out.println("Average of a, b = " + avg);

        System.out.print("Enter a number (could be negative): ");
        double y = sc.nextDouble();
        System.out.println("Absolute of " + y + " = " + Math.abs(y));

        sc.close();
    }
}