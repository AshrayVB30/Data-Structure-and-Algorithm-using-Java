import java.util.*;

public class MaxMinusingDoC {
    static Scanner sc = new Scanner(System.in);
    static int max = 0, min = 0;
    static int a[];
    static int size;

    static void MaxMin(int i, int j) {
        int mid, max1, min1;
        if (i == j) { // Base case: single element
            max = min = a[i];
        } else if (i == j - 1) { // Base case: two elements
            if (a[i] < a[j]) {
                max = a[j];
                min = a[i];
            } else {
                max = a[i];
                min = a[j];
            }
        } else { // Recursive case: more than two elements
            mid = (i + j) / 2;
            MaxMin(i, mid);
            max1 = max;
            min1 = min;
            MaxMin(mid + 1, j);
            if (max < max1)
                max = max1;
            if (min > min1)
                min = min1;
        }
    }

    public static void main(String[] args) {
        long start, end;
        System.out.println("Enter number of elements: ");
        size = sc.nextInt();
        a = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        start = System.nanoTime();
        MaxMin(0, size - 1);
        end = System.nanoTime();
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Time Complexity is " + (end - start) + "ns");
    }
}
