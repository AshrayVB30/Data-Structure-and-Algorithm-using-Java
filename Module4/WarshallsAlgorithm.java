package Module4;

import java.util.Scanner;

public class WarshallsAlgorithm {

    void warshall(int[][] graph, int n){
        int[][] dist = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                dist[i][j] = graph[i][j];
            }
        }

        for (int k=0; k<n; k++){
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    dist[i][j] = (dist[i][j] != 0 || (dist[i][k] != 0 && dist[k][j] != 0)) ? 1:0;
                }
            }
        }
        solution(dist, n);
    }

    void solution(int[][] dist, int n){
        System.out.println("The transitive closure of given graph is: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        System.out.println("Enter the adjacency matrix: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        WarshallsAlgorithm wa = new WarshallsAlgorithm();
        wa.warshall(graph, n);
    }
}

//Output:
//Enter the number of vertices:
// 4
//Enter the adjacency matrix:
//0 1 0 0
//0 0 0 1
//0 0 0 0
//1 0 1 0
//The transitive closure of given graph is:
//1 1 1 1
//1 1 1 1
//0 0 0 0
//1 1 1 1