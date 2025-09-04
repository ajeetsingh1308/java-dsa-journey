//. datatype variableName = value;
package JavaFundamentals.BasicsJava;

public class Variable {
  
  public static void main(String[] args) {
    int a = 10; // variable declaration and initialization
    int b = 20; // variable declaration and initialization
    System.out.println(a); // print statement
    System.out.println(b); // print statement

    a =5; // re-assigning value to a
    System.out.println(a); // print statement

    a = b;   // assigning value of b to a
    System.out.println(a); // print statement

    String name = "Ajeet"; // variable declaration and initialization
    System.out.println(name); // print statement

    int sum = a + b; // variable declaration and initialization
    System.out.println("Sum of a and b is: " + sum); // print statement
  }
}
