package JavaFundamentals.Conditional;

public class ElseIf {
  
  public static void main(String[] args) {
    
    // IF-ELSE-IF
    int age = 14;

    if(age>=18){
      System.out.println("You are an Adult");
    }else if( age >13 && age<18){
      System.out.println("You are Teenager");
    }else{
      System.out.println("You are Child");
    }
  }
}
