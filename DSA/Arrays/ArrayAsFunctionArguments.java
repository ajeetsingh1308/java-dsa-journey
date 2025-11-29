package DSA.Arrays;
import java.util.*;

public class ArrayAsFunctionArguments {

  public static void updateArray(int Array[]) {
    for(int i =0; i<Array.length; i++){
      Array[i] = Array[i]+ 1;
    }

    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n = sc.nextInt();
    int Array[] = new int[n];

    System.out.print("Enter the Number: ");
    for(int i=0; i<n; i++){
      Array[i] = sc.nextInt();
    }
    updateArray(Array);

    System.out.println("The final array is: "+Arrays.toString(Array));
    sc.close();
  }
  
}
