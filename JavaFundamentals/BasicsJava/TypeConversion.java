// Type Conversion & Type Casting in Java
//Type conversion is the process of converting a value of one data type into another.In Java, this usually happens between numeric types (int, long, float, double, etc.).

// Type Casting in Java.
// Type casting is the process of manually converting one data type into another.
// 	•	It’s used when implicit conversion is not possible (e.g., big type → small type).
// datatype variable = (datatype) value;
package JavaFundamentals.BasicsJava;

public class TypeConversion {
  
  public static void main(String[] args) {
    int a =30;
    long b =50;
    float c = 5.5f;
    double d = 6.6d;
    
    // 1️⃣ Implicit Type Conversion (Type Promotion / Widening)
    //  •	Done automatically by Java.
    //	•	Happens when a smaller data type is assigned to a bigger data type.
    //	•	✅ Safe → No data loss.
     b = a ; // implicit type conversion, no data loss
      c = b; // implicit type conversion, no data loss

     System.out.println(a);
     System.out.println(b);
    System.out.println(c);


    // •	Done manually by the programmer using (type).
    // •	Happens when a bigger data type is assigned to a smaller data type.
    // •	⚠️ Risky → Possible data loss.
    // •  2️⃣ Explicit Type Conversion (Type Casting / Narrowing)
    //  a = b; // explicit type conversion, data loss
     a = (int) b; // type casting, no data loss
      a = (int) d; // type casting, data loss
      b = (int) c; // type casting, data loss
      c = (float) d; // type casting, no data loss
      System.out.println(d);
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
  }
  
}
