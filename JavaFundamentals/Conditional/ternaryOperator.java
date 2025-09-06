package JavaFundamentals.Conditional;

public class ternaryOperator {

  //writing of if-else code in just one logical line of code
  // variable = condition ? statement1 : statement2;
  // :- else( nahi toh )
  //variable will store return value 

  public static void main(String[] args) {
     int number = 10;

     //ternary operator
     String result = ((number % 2) == 0)? ("Number is even") : ("number is Odd");
     System.out.println(result);
  }
  
}
