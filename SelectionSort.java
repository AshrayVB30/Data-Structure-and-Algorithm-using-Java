package Module1;

import java.util.*;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] a = new int[100000];
        Scanner in = new Scanner(System.in);
        long start, end;
        System.out.println("SELECTION SORT ALGORITHM");
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.print("Array elements to be sorted: ");
        for (int i = 0; i < n; i++) 
            System.out.print(a[i] + " ");
        
        start = System.nanoTime();
        selectionSort(a, n);
        end = System.nanoTime();
        
        System.out.print("\nThe sorted elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nThe time complexity: " + (end - start) + "ns");
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
