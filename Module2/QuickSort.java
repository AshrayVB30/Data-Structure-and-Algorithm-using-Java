package Module2;

import java.util.*;

public class QuickSort {

    static void Qsort(int a[], int l, int h){
        int s;
        if (l < h){
            s = partition(a, l, h);
            Qsort(a, l, s-1);
            Qsort(a, s+1, h);
        }
    }

    static int partition (int a[], int l, int h){
        int pivot = a[l];
        int i, j;
        i = l+1;
        j = h;
        while(i <= j){
            while (a[i] <= pivot && i <= h){
                i++;
            }
            while (a[j] > pivot){
                j--;
            }
            if (i < j){
                swap(a, i, j);
            }
        }
        a[l] = a[j];
        a[j] = pivot;
        return j;
    }

    static void swap(int a[], int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start, end;
        int i;
        System.out.println("Quick Sort Algorithm");
        System.out.println("Enter no.of elements to be sorted: ");
        int n = in.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter elements to be sorted: ");
        for (i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        start = System.nanoTime();
        Qsort(a, 0, n-1);
        end = System.nanoTime();
        System.out.println("The sorted elements are: ");
        for (i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\nTime Complexity is: "+(end-start)+"ns");
    }
}
