package Module1;

import java.util.*;

public class MergeSort2 {
	
	public static void main(String[] args) {
		int a[] = new int[100000];
		Scanner in = new Scanner(System.in);
		long start, end;
		System.out.println("MERGE SORT ALGORITHM");
		System.out.println("Enter the number of element: ");
		int n = in.nextInt();
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(100);
		}
		System.out.print("Array elements to be sorted: ");
		for (int i = 0; i < n; i++) 
			System.out.print(a[i]+ " ");
		start = System.nanoTime();
		mergeSort(a, 0, n-1);
		end = System.nanoTime();
		System.out.print("\nThe sorted elements: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nThe time complexity: "+(end-start)+"ns");
	}
	static void mergeSort(int a[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}
	static void merge(int a[], int low, int mid, int high) {
		int i, j, k;
		int [] b = new int[high - low + 1];
		int h = low;
		i = 0;
		j = mid + 1;
		while (h <= mid && j <= high) {
			if (a[h] < a[j]) {
				b[i] = a[h];
				h = h + 1;
			} else {
				b[i] = a[j];
				j = j + 1;
			}
			i = i + 1;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				b[i] = a[k];
				i = i + 1;
			}
		} else {
			for (k = h; k <= mid; k++) {
				b[i] = a[k];
				i = i + 1;
			}
		}
		for (k = 0; k < b.length; k++) {
			a[low + k] = b[k];
		}
	}
}
