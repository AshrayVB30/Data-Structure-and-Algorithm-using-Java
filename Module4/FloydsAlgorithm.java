package Module4;
import java.util.Scanner;

public class FloydsAlgorithm {

    void floyds(int[][] w, int n) {
        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++)
                    w[i][j] = Math.min(w[i][j], w[i][k] + w[k][j]);
    }

    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int n, i, j;
        System.out.println("Enter the number of vertices: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the weighted matrix: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        FloydsAlgorithm f = new FloydsAlgorithm();
        f.floyds(a, n);
        System.out.println("The shortest path matrix is: ");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//
//OUTPUT:
//Enter the number of vertices:
//        4
//Enter the weighted matrix:
//        0 999 3 999
//        2 0 999 999
//        999 7 0 1
//        6 999 999 0
//The shortest path matrix is:
//        0 10 3 4
//        2 0 5 6
//        7 7 0 1
//        6 16 9 0