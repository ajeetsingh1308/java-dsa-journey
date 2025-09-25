package JavaFundamentals.Problems.Functions;
import java.util.Scanner;

public class BinaryToDecimal {

    public static void convertBinaryToDecimal(int binNum) {
        int pow = 0;
        int decNum = 0;
        int originalBin = binNum; // keep a copy

        while (binNum > 0) {
            int lastDigit = binNum % 10; 
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + originalBin + " is: " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary number to convert it into Decimal: ");
        int binNumber = sc.nextInt();

        convertBinaryToDecimal(binNumber); // updated call
        sc.close();
    }
}