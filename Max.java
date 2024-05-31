import java.util.Scanner;

public class Max{
  public static vod main(String args[]){
    int a, a;
    System.out.print("Enter the value of n: ");
    Scanner sc = new.Scanner(System.in);
    int a1 = sc.nextInt();
    int [] arr = new int[a1+1];
    for (i=0; i < a1;i++)
      arr[i] = sc.nextInt();
    int max = 0;

    for (i=0; i < a1; i++)
      if (arr[i] > max)
        max = arr[i];
    System.out.println("Max value is: "+max);
  }
}

// Alogrithm: Maximum element(A[0, 1, 2, 3,.....n-1]) 
// Input: Array of element(A) 
// Output: Largest element MaxValue <- A[0] 
//   for i <- 1 to n-1 do 
//     if A[i] > MaxValue 
//       MaxValue <- A[i] 
//   return MaxValue

// Time Complexity: T(n) ∈ O(n) The time complexity of this algorithm is O(n), where n is the number of elements in the array. 
// This is because the algorithm iterates through the array once to find the maximum value.
