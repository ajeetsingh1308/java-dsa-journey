// Type Promotion in Java
// 🔹 What is Type Promotion?

// Type promotion in Java is when smaller data types are automatically converted (“promoted”) to larger data types during operations, so that calculations don’t lose precision.
// 	•	It’s a kind of implicit type conversion.
// 	•	Happens mainly in expressions (when operators like +, -, *, / are used).

// ⸻

// 📌 Rules of Type Promotion in Java
// 	1.	Byte, Short, and Char → Int
// 	•	If an arithmetic operation involves byte, short, or char, Java promotes them to int before performing the calculation.
// 	•	Example:

// byte a = 10, b = 20;
// // result = a + b; // Error: because result is int, not byte
// int result = a + b; // Works fine


// 	2.	If one operand is long → whole expression becomes long

// int a = 10;
// long b = 20;
// long result = a + b; // promoted to long


// 	3.	If one operand is float → whole expression becomes float

// int a = 5;
// float b = 6.5f;
// float result = a + b; // promoted to float


// 	4.	If one operand is double → whole expression becomes double

// float a = 5.5f;
// double b = 6.6;
// double result = a + b; // promoted to double



// ⸻

// ✅ Example Program (Type Promotion in Action)

// public class TypePromotion {
//     public static void main(String[] args) {
//         byte a = 10;
//         byte b = 20;
//         int c = a + b; // byte + byte = int

//         char ch = 'A'; // ASCII 65
//         int d = ch + 1; // char promoted to int
//         System.out.println("c = " + c);
//         System.out.println("d = " + d);

//         int x = 5;
//         double y = 6.5;
//         double z = x + y; // int promoted to double
//         System.out.println("z = " + z);
//     }
// }

// 🔎 Output

// c = 30
// d = 66
// z = 11.5


// ⸻

// ✨ In short:
// 	•	Type promotion ensures Java doesn’t lose data in operations.
// 	•	The hierarchy is:
// byte → short → int → long → float → double

// ⸻

// 👉 Do you want me to also show you a tricky case where type promotion causes errors, like when working with byte and casting back?

package JavaFundamentals.BasicsJava;

public class TypePromotion {

  public static void main(String[] args) {

    byte a = 10;
    byte b = 20;
    // byte c = a + b; // Error: because result is int, not byte
    int c = a + b; // Works fine
    System.out.println(c);

    char ch = 'A'; // ASCII 65
    int d = ch + 1; // char promoted to int
    System.out.println(d); // prints 66

    int x = 5;
    double y = 6.5;
    double z = x + y; // int promoted to double
    System.out.println(z);
    
  }
  
}
