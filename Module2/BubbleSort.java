package Module2;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = new int[10000];
        Scanner in = new Scanner(System.in);
        long start, end;

        System.out.println("BUBBLE SORT");
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();

        Random rand = new Random();
        for (int i=0; i<n; i++){
            a[i] = rand.nextInt(100);
        }

        System.out.println("Array elements to be sorted: ");
        for (int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }

        start = System.nanoTime();
        Bsort(a, n);
        end = System.nanoTime();

        System.out.println("\n\nThe sorted elements: ");
        for (int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\n\nThe time complexity is " + (end - start) + "ns");
    }


    static void Bsort(int[] arr, int n){
        for (int i=0; i < n-1; i++){
            for (int j=0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
