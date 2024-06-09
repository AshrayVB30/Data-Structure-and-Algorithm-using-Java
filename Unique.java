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
