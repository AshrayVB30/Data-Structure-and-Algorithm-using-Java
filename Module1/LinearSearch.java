package Module1;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
//        Arrays.sort(arr);
        int pos = 0;
        boolean find = false;
        int n = arr.length;

        System.out.println("Enter the element to search: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        for (int i=0; i<n; i++){
            if (arr[i] == element){
                pos = i;
                find = true;
                break;
            }
        }

        if (find){
            System.out.println("Found at: "+(pos));
        } else {
            System.out.println("Not found");
        }
    }
}
