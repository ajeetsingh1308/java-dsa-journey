package JavaFundamentals.Operator;

public class Assignment {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    // Simple Assignment
    int x = a;
    System.out.println("Simple Assignment: " + x);

    // Add and Assign
    x += b; // x = x + b
    System.out.println("Add and Assign: " + x);

    // Subtract and Assign
    x -= b; // x = x - b
    System.out.println("Subtract and Assign: " + x);

    // Multiply and Assign
    x *= b; // x = x * b
    System.out.println("Multiply and Assign: " + x);

    // Divide and Assign
    x /= b; // x = x / b
    System.out.println("Divide and Assign: " + x);

    // Modulus and Assign
    x %= b; // x = x % b
    System.out.println("Modulus and Assign: " + x); 
  }
  
}
