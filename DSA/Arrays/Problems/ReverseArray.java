package DSA.Arrays.Problems;
import java.util.*;

public class ReverseArray {

  public static void reverse( int[] arr){
    int start = 0;
    int end = arr.length - 1;

    while (start < end){
      int temp= arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the number of element you want in array: ");
    int n = sc.nextInt();

    int numbers[] = new int[n];

    System.out.print("Enter your number : ");
    for(int i=0; i<n; i++){
      numbers[i] = sc.nextInt();
    }

    //reverse function
    reverse(numbers);
    
    // Output reversed array
    System.out.println("Reversed array:");
    for (int i = 0; i < n; i++) {
      System.out.print(numbers[i] + " ");
    }
    
    System.out.println("Final array: "+Arrays.toString(numbers));// while showing the final array we need to convert it into strings 

    sc.close();
    
  }
  
}
