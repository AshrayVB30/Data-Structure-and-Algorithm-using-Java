package Module3;

import java.util.Arrays;
import java.util.Scanner;

public class CoinExchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of coin denominations
        System.out.print("Enter the number of coin denominations: ");
        int numCoins = scanner.nextInt();

        // Read the coin denominations
        System.out.print("Enter the coin denominations: ");
        int[] denominations = new int[numCoins];
        for (int i = 0; i < numCoins; i++) {
            denominations[i] = scanner.nextInt();
        }

        // Read the amount to be changed
        System.out.print("Enter the amount to be changed: ");
        int amount = scanner.nextInt();

        // Sort the denominations in ascending order
        Arrays.sort(denominations);

        // Calculate the minimum number of coins required
        int minCoins = calculateMinCoins(denominations, amount);

        // Output the result
        if (minCoins != -1) {
            System.out.println(minCoins);
        } else {
            System.out.println("The amount cannot be made up with the given denominations.");
        }
    }

    // Function to calculate the minimum number of coins required
    public static int calculateMinCoins(int[] denominations, int amount) {
        int count = 0;

        // Traverse the sorted array in reverse order for the greedy approach
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (amount >= denominations[i]) {
                count += amount / denominations[i];  // Add the number of coins of the current denomination
                amount %= denominations[i];          // Update the remaining amount
            }
        }

        // If there's still some amount left, it cannot be changed with given denominations
        return amount == 0 ? count : -1;
    }
}
