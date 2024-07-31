package Module4;

public class ZeroOneKnapsackusingDynamicProgramming {

    public static void main(String[] args) {
        int[] weights = {2, 1, 3, 2};
        int[] values = {12, 10, 20, 15};
        int capacity = 5;

        knapsack(weights, values, capacity);
    }

    public static void knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Dynamic programming to fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Print the dp matrix
        System.out.println("DP Matrix:");
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                System.out.print(dp[i][w] + " ");
            }
            System.out.println();
        }

        // Maximum value in the knapsack
        System.out.println("Maximum value: " + dp[n][capacity]);

        // Backtracking to find the items included in the knapsack
        int w = capacity;
        System.out.print("Items included: ");
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                System.out.print(i + " ");
                w -= weights[i - 1];
            }
        }
    }
}