package JavaFundamentals.Operator;

public class Unary {

    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);

        // // Unary Plus
        // int unaryPlus = +a;
        // System.out.println("Unary Plus: " + unaryPlus);

        // // Unary Minus
        // int unaryMinus = -a;
        // System.out.println("Unary Minus: " + unaryMinus);

        // // Increment

        // a++;
        // System.out.println("After Increment: " + a);

        // // Decrement
        // a--;
        // System.out.println("After Decrement: " + a);
    }
  
}
