package JavaFundamentals.Problems.Conditional;

import java.util.Scanner;

public class GetDayOfWeek {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the day in number (1-7): ");
    int Day = sc.nextInt();

    switch(Day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid! Please enter a number between 1 and 7.");
    }
    sc.close();
  }
}