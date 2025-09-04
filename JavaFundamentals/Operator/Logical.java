package JavaFundamentals.Operator;

public class Logical {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    // Logical AND
    boolean andResult = (a > 5) && (b < 10);
    System.out.println("Logical AND: " + andResult);

    // Logical OR
    boolean orResult = (a > 5) || (b > 10);
    System.out.println("Logical OR: " + orResult);
    
    // Logical NOT
    boolean notResult = !(a > 5);
    System.out.println("Logical NOT: " + notResult);
  }
  
}
