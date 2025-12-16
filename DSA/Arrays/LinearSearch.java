package DSA.Arrays;

import java.util.Scanner;

public class LinearSearch {

  public static int linearSearch(int numberPool[],int key ){

    for(int i=0; i< numberPool.length; i++ ){
      if(numberPool[i] == key){
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numberPool[] = {23, 56, 78, 42, 91, 50, 77, 91, 59, 11};
    
    System.out.println("Wanna play a guess game? \nYou have to guess the number present in our NumberPool");

    System.out.print("Enter your guess Number");
    int key = sc.nextInt();

    int result = linearSearch(numberPool, key);

    if( result == -1){
      System.out.print("Better try you luck with other numbers 😏😏");
    }else{
      System.out.println("Congratulationss you guessed the correct number from our number pool");
      System.out.println("Your number "+key+ " is at index " +result);
    }

    sc.close();
  }
  
}
