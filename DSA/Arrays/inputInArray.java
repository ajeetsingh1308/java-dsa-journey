package DSA.Arrays;

import java.util.*;

public class inputInArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter the number of subjects in Sem1: ");
    int n = sc.nextInt();
    int ArrayMakrs[] = new int[n];
    
    System.out.print("Enter you Semester 1 marks: ");
    for(int i=0; i<n; i++){
      ArrayMakrs[i] = sc.nextInt();
    }
    System.out.println("The lenght of the array is:" + ArrayMakrs.length);
    System.out.println("Final array: "+Arrays.toString(ArrayMakrs));// while showing the final array we need to convert it into strings 

    sc.close();
  }
  
}
