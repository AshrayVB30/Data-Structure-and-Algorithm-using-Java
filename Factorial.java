import java.util.*;

public class Factorial{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n = sc.nextInt();
      System.out.println("Factorial is: "+fact(n);
  }
  static int fact(int n){
     if n == 0:
       return 1;
    else:
       return n * fact(n-1);
  }
}

// Algorithm: fact(n) 
// Input: number(n) 
// Output: Factorial of n 
  // if n == 0 
  //   return 1 
  // else 
  //   return n * fact(n-1)

// Time Complexity: T(n) ∈ O(n) factorial calculation algorithm, it's O(n), where n is the input number. 
// This is because the algorithm iterates through each integer from n down to 1 in a recursive manner, resulting in linear time complexity.
