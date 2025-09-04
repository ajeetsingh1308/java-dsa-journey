package JavaFundamentals.Problems.Basics;
import java.util.*;
public class GST {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the price of the Pen: ");
    float Pen = scan.nextFloat();

    System.out.print("Enter the price of the Pencil: ");
    float Pencil = scan.nextFloat();

    System.out.print("Enter the price of the Eraser: ");
    float Eraser = scan.nextFloat();
    scan.close();

    float TotalCost = ( Pen + Pencil +Eraser);
    System.out.println("The Total AMOUNT: " +TotalCost);

    System.out.println("The Total AMOUT+ GST: "+(TotalCost+ 0.18f * TotalCost));
    
  }

  
}
