package JavaFundamentals.Problems.Basics;
import java.util.*;

public class AreaOfCircle {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Radius of Circle: ");
    float radius = scan.nextFloat();

    float AreaOfCircle = (3.14f * radius * radius); // java takes float value by default as double so we have to specify f after 3.14
    scan.close();

    System.out.println("The Area of Circle is: " +AreaOfCircle);

    
  }
  

}
