import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int pos = 0, mid;
        boolean find = false;
        int n = arr.length;
        int start = 0, end = n-1;
        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        while (start <= end){
            mid = (start + end) / 2;
            if (arr[mid] == element){
                pos = mid;
                find = true;
                break;
            } else if (arr[mid] > element){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (find){
            System.out.println("Found at "+(pos + 1));
        } else {
            System.out.println("Not found");
        }
    }
}
