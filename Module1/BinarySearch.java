package Module1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        Arrays.sort(arr);
        int pos = 0, mid;
        boolean find = false;
        int n = arr.length;
        int start = 0, end = n-1;
        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        while (start <= end){
            mid = (start + end) / 2;
            if (arr[mid] == target){
                pos = mid;
                find = true;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (find){
            System.out.println("Found at "+(pos));
        } else {
            System.out.println("Not found");
        }
    }
}
