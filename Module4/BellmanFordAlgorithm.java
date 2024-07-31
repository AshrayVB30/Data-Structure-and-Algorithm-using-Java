package Module4;

import java.util.Scanner;

public class BellmanFordAlgorithm {

    private int distances[];
    private int numberOfVertices;
    public static final int MAX_VALUE = 99999;  // Define a constant for infinity

    public BellmanFordAlgorithm(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        distances = new int[numberOfVertices + 1];
    }

    public void BellmanFordEvaluation(int source, int[][] adjacencyMatrix) {
        // Initialize distances from source to all vertices as infinity
        for (int node = 1; node <= numberOfVertices; node++) {
            distances[node] = MAX_VALUE;
        }
        distances[source] = 0;  // Distance to the source itself is zero

        // Relax all edges |V| - 1 times
        for (int node = 1; node <= numberOfVertices - 1; node++) {
            for (int sourceNode = 1; sourceNode <= numberOfVertices; sourceNode++) {
                for (int destinationNode = 1; destinationNode <= numberOfVertices; destinationNode++) {
                    if (adjacencyMatrix[sourceNode][destinationNode] != MAX_VALUE) {
                        if (distances[destinationNode] > distances[sourceNode] + adjacencyMatrix[sourceNode][destinationNode]) {
                            distances[destinationNode] = distances[sourceNode] + adjacencyMatrix[sourceNode][destinationNode];
                        }
                    }
                }
            }
        }

        // Check for negative-weight cycles
        for (int sourceNode = 1; sourceNode <= numberOfVertices; sourceNode++) {
            for (int destinationNode = 1; destinationNode <= numberOfVertices; destinationNode++) {
                if (adjacencyMatrix[sourceNode][destinationNode] != MAX_VALUE) {
                    if (distances[destinationNode] > distances[sourceNode] + adjacencyMatrix[sourceNode][destinationNode]) {
                        System.out.println("The graph contains a negative edge cycle");
                        return;
                    }
                }
            }
        }

        // Print the distances to each vertex
        for (int vertex = 1; vertex <= numberOfVertices; vertex++) {
            System.out.println("Distance from source " + source + " to vertex " + vertex + " is " + distances[vertex]);
        }
    }

    public static void main(String[] args) {
        int numberOfVertices;
        int source;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        numberOfVertices = scanner.nextInt();

        int[][] adjacencyMatrix = new int[numberOfVertices + 1][numberOfVertices + 1];
        System.out.println("Enter the adjacency matrix:");
        for (int sourceNode = 1; sourceNode <= numberOfVertices; sourceNode++) {
            for (int destinationNode = 1; destinationNode <= numberOfVertices; destinationNode++) {
                adjacencyMatrix[sourceNode][destinationNode] = scanner.nextInt();
                if (sourceNode == destinationNode) {
                    adjacencyMatrix[sourceNode][destinationNode] = 0; // Distance from a node to itself is 0
                    continue;
                }
                if (adjacencyMatrix[sourceNode][destinationNode] == 0) {
                    adjacencyMatrix[sourceNode][destinationNode] = MAX_VALUE; // No direct edge
                }
            }
        }

        System.out.println("Enter the source vertex:");
        source = scanner.nextInt();

        BellmanFordAlgorithm bellmanFord = new BellmanFordAlgorithm(numberOfVertices);
        bellmanFord.BellmanFordEvaluation(source, adjacencyMatrix);

        scanner.close();
    }
}




//OUTPUT:
//Enter the number of vertices:
//        3
//Enter the adjacency matrix:
//        0 1 0
//        0 0 -1
//        0 2 -2
//Enter the source vertex:
//        1
//Distance from source 1 to vertex 1 is 0
//Distance from source 1 to vertex 2 is 1
//Distance from source 1 to vertex 3 is 0