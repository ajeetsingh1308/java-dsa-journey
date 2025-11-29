package DSA.Arrays.Problems;
import java.util.*;

public class minMaxSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //input
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    //input the values
    System.out.println("Enter the " + n + " Elements of the array: ");
    for (int i =0; i< n; i++){
      arr[i]= sc.nextInt();
    }

    //min and max
    int min = arr[0];
    int max = arr[0];

    //Find min and Max
    for(int i = 1;  i < n;  i++){
      if(arr[i] < min){
        min =arr[i];
      }
      if( arr[i]> max) {
        max = arr[i];
      }

    }
    System.out.println("Minimum Number: "+min);
    System.out.println("Maximum Number: "+max);

    sc.close();
  }
  
}
