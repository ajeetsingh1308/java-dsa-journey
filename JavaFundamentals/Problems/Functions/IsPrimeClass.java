package JavaFundamentals.Problems.Functions;
import java.util.Scanner;

public class IsPrimeClass {

  public static boolean isPrime(int n){
    // corner case for 2 
    if(n == 2){
      return true;
    }
    
    boolean isPrime = true;
    for(int i=2; i<n-1; i++){
      if(n % i == 0){
        isPrime =false;
        return isPrime;
      }
    }
    return isPrime;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter thre number to check if its prime or not: ");
    int Num = sc.nextInt();

    System.out.println(isPrime(Num));
    sc.close();
  }
  
}
