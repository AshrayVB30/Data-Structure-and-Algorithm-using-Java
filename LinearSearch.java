import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr);
        int pos = 0;
        boolean find = false;
        int n = arr.length;

        System.out.println("Enter element to search: ");
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
            System.out.println("Found at: "+(pos+1));
        } else {
            System.out.println("Not found");
        }
    }
}
