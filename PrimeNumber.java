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
