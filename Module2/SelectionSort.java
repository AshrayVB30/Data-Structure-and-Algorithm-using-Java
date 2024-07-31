package Module2;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

    static void SSort(int[] arr, int n){
        for (int i = 0; i < n; i++){
            int minIndex = i;
            for (int j = i + 1; j < n -1; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10000];
        Scanner in = new Scanner(System.in);
        long start, end;

        System.out.println("SELECTION SORT");
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        Random rand = new Random();
        for (int i = 0; i < n; i++){
            a[i] = rand.nextInt(100);
        }

        System.out.println("Array element to be sorted: ");
        for (int i=0; i < n; i++){
            System.out.print(a[i]+" ");
        }

        start = System.nanoTime();
        SSort(a, n);
        end = System.nanoTime();

        System.out.println("\nThe sorted elements: ");
        for (int i=0; i < n; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n\nThe time complexity is "+(end - start)+"ns");
    }
}
