package Module1;

import java.util.*;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] a = new int[100000];
        Scanner in = new Scanner(System.in);
        long start, end;
        System.out.println("BUBBLE SORT ALGORITHM");
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
        bubbleSort(a, n);
        end = System.nanoTime();
        
        System.out.print("\nThe sorted elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nThe time complexity: " + (end - start) + "ns");
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//                     Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// Algorithm: BubbleSort(A[0.......n-1])
//               for i <- 0 to n-2 do:
//                 for j <- 0 to n-2-i:
//                   if A[j+1] < A[j]
//                     swap(A[j], A[j+1])

// Time Complexity: T(n) ∈ O(n^2)
