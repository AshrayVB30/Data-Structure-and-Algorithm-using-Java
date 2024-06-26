//Checking the element in an array are unique or not

package Module1;
import java.util.*;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Max size: ");
        int u = sc.nextInt();
        int[] arr = new int[u]; // Declared the array
        for (int i = 0; i < u; i++) {
            arr[i] = sc.nextInt();
        }
        boolean count = true;
        for (int i = 0; i < u; i++) { // Initialized variable 'i' in the loop
            for (int j = 0; j < u; j++) { // Initialized variable 'j' in the loop
                if (arr[i] == arr[j] && i != j) { // Fixed condition for i != j
                    count = false;
                    break; // Added break to optimize the loop
                }
            }
            if (!count) // Optimized the condition
                break; // Added break to optimize the loop
        }
        if (count)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}


// Algorithm: Unique of Array element(A[1, 2, 3,.....n])
// Input: Array of element(A)
// Output: Yes/No
//   for i <- 0 to n -2
//     for j <- i+1 to n-1
//       if A[i] == A[j]
//         return False
//   return True

// Time Complexity: T(n) ∈ O(n^2)
//    The time complexity of this algorithm, it's O(n^2), where n is the size of the array. 
//     This is because it uses nested loops to compare each element in the array with every other element, resulting in quadratic time complexity.
