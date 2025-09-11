package JavaFundamentals.FunctionsJava;

public class CallByValue {

  public static void swap(int a, int b){
    //swap
    int temp =a;
    a= b;
    b =temp;
  }
  
  public static void main(String[] args) {
     // swap - values exchanges
     int a =5;
     int b=10;

     swap(a,b);
     System.out.println("A= "+a);
     System.out.println("B =" +b);
     // the number will be not swept. It will be swept, but the value will be the same as the previous cause it's calling by passing the same value.
  }
  
}
