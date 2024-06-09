//Generating list of Prime Number using Seive of Eratostenes Algorithm

package Module1;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] Prime = new int[n+1];
        Arrays.fill(Prime,1);
        for (int i = 2; i*i <= n; i++) {
            if (Prime[i] != 0) {
                for (int j = i*i; j <= n; j += i) 
                    Prime[j] = 0;
            }
        }
        System.out.println("Prime numbers are: "); 
        for (int i = 2; i <= n; i++) { 
            if (Prime[i] != 0)
                System.out.print(i + " "); 
        }
    }
}


// Algorithm: Generate list of prime numbers using Sieve Eratostenes Algorithm
// Step 1: Start
// Step 2: Start with a list of numbers from 0 to limit, and assume all of them are prime
// Step 3: Start from 2, the first prime number and mark all its multiples as non-prime
// Step 4: Move to the next unmarked number(which will be prime)and repeat the process
// Step 5: Continue this process until you've checked all the numbers up to the square root of the limit.
// Step 6: The numbers that are still marked as prime at the end are the prime number.
// Step 7: End
