package JavaFundamentals.Problems.Functions;
import java.util.Scanner;


public class BinomialCoefficient {
  
  public static int FactorialOfNumber(int num){
    int factorial = 1;

    for(int i= 1; i <= num; i++){
      factorial = factorial * i;
    }
    
    return factorial;
  }

  public static int BinomialCoefficientofNumber(int num,int r){
    int fact_n = FactorialOfNumber(num);
    int fact_r = FactorialOfNumber(r);
    int fact_nmr = FactorialOfNumber(num-r);

    int BinomialCoefficient = fact_n / (fact_r * fact_nmr);
    return BinomialCoefficient;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the n and r to get the BinomialCoefficient: ");
    int num = sc.nextInt();
    int r = sc.nextInt();
    

    int BinomialCoefficient = BinomialCoefficientofNumber(num,r);
    System.out.println("The BinomialCoefficient of "+num +" and "+ r +" is : " +BinomialCoefficient);
    sc.close();
  }
  
}

