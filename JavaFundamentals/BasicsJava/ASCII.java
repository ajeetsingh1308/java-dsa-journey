package JavaFundamentals.BasicsJava;

public class ASCII {

  public static void main(String[] args) {
    
    char CH1 = 'A'; // 2 byte
    char ch1 = 'a'; // 2 byte
    char CH2 = 'B'; // 2 byte
    char ch2 = 'b'; // 2 byte
    char CH25 = 'Y'; // 2 byte
    char ch25 = 'y'; // 2 byte
    char CH26 = 'Z'; // 2 byte
    char ch26 = 'z'; // 2 byte
    
    int NUMBER1 = CH1; // implicit type conversion
    int number1 = ch1; // implicit type conversion
    int NUMBER2 = CH2; // implicit type conversion
    int number2 = ch2; // implicit type conversion
    int NUMBER25 = CH25; // implicit type conversion
    int number25 = ch25; // implicit type conversion
    int NUMBER26 = CH26; // implicit type conversion
    int number26 = ch26; // implicit type conversion
    
    System.out.println(NUMBER1);
    System.out.println(number1);
    System.out.println(NUMBER2);
    System.out.println(number2);
    System.out.println(NUMBER25);
    System.out.println(number25);
    System.out.println(NUMBER26);
    System.out.println(number26);

    // print ASCII values from 0 to 127
    System.out.println("ASCII values from 0 to 127:");
      for (int i = 0; i <= 127; i++) {
      char ch = (char) i; // convert number to char
      System.out.println(i + " = " + ch);
    }

    
  }
  
}
