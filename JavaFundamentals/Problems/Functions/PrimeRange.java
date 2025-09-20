package JavaFundamentals.Problems.Functions;

public class PrimeRange {

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

  public static void PrimesInRange(int n){
    for(int i=2; i<=n; i++){
      if(isPrime(i)){
        System.out.print(i + " ");
      }

    }
    System.out.println();
    
  }
  public static void main(String[] args) {
    PrimesInRange(20);
    
  }
  
}
