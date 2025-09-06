package JavaFundamentals.Conditional;

import java.util.Scanner;

// switch (expression) {
//   case value1:
//     // code to execute if expression == value1
//     break;
//   case value2:
//     // code to execute if expression == value2
//     break;
//   ...
//   default:
//     // code if no case matches
// }

public class GeoPoliticsSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a Country (India, USA, China, Russia): ");
    String country = sc.nextLine();

    switch (country) {
      case "india":
        System.out.println("India is strengthening its Indo-Pacific strategy and hosting G20 initiatives.");
        break;
      case "usa":
        System.out.println("USA is focusing on NATO commitments and Indo-Pacific alliances.");
        break;
      case "china":
        System.out.println("China is engaged in South China Sea disputes and expanding BRICS influence.");
        break;
      case "russia":
        System.out.println("Russia continues to face sanctions amid the Ukraine conflict.");
        break;
      default:
        System.out.println("No current data available for this country.");
    }

    sc.close();
  }
}
