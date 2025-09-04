package JavaFundamentals.BasicsJava;

public class DataTypes {

  public static void main(String[] args) {
    byte a = 10; // 1 byte [-128 to 127]256 values
    short b = 20; // 2 byte [-32,768 to 32,767]65536 values
    int c = 30; // 4 byte [-2,147,483,648 to 2,147,483,647]4 billion values
    float f = 5.5f; // 4 byte   
    long d = 40L; // 8 byte   
    double g = 6.6d; // 8 byte  
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(f);
    System.out.println(g);

    boolean i = true; // 1 bit
    char h = 'A'; // 2 byte
    String name = "Ajeet"; // not a primitive data type, it's a class
    System.out.println(h);
    System.out.println(i);
    System.out.println(name);
  }
  
}


