package Module5;

import java.util.*;

// Node class represents a job assignment
class Node {
    Node parent; // parent node
    int pathCost; // cost to reach this node
    int cost; // lower bound cost
    int workerID; // worker ID
    int jobID; // job ID
    boolean assigned[]; // keeps track of assigned jobs

    public Node(int N) {
        assigned = new boolean[N]; // initialize assigned jobs array
    }
}

public class JobAssignmentProbelm {
    static final int N = 4; // number of workers and jobs

    // Function to create a new search tree node
    static Node newNode(int x, int y, boolean assigned[], Node parent) {
        Node node = new Node(N);
        for (int j = 0; j < N; j++) {
            node.assigned[j] = assigned[j];
        }
        if (y != -1) {
            node.assigned[y] = true;
        }
        node.parent = parent;
        node.workerID = x;
        node.jobID = y;
        return node;
    }

    // Function to calculate the least promising cost of a node
    static int calculateCost(int costMatrix[][], int x, int y, boolean assigned[]) {
        int cost = 0;
        boolean available[] = new boolean[N];
        Arrays.fill(available, true);

        for (int i = x + 1; i < N; i++) {
            int min = Integer.MAX_VALUE, minIndex = -1;
            for (int j = 0; j < N; j++) {
                if (!assigned[j] && available[j] && costMatrix[i][j] < min) {
                    minIndex = j;
                    min = costMatrix[i][j];
                }
            }
            cost += min;
            available[minIndex] = false;
        }
        return cost;
    }

    // Function to print job assignment
    static void printAssignments(Node min) {
        if (min.parent == null) {
            return;
        }
        printAssignments(min.parent);
        System.out.println("Assign Worker " + (char) (min.workerID + 'A') + " to Job " + min.jobID);
    }

    // Function to solve Job Assignment Problem using Branch and Bound
    static int findMinCost(int costMatrix[][]) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.cost));

        boolean assigned[] = new boolean[N];
        Node root = newNode(-1, -1, assigned, null);
        root.pathCost = root.cost = 0;
        root.workerID = -1;

        pq.add(root);

        while (!pq.isEmpty()) {
            Node min = pq.poll();
            int i = min.workerID + 1;

            if (i == N) {
                printAssignments(min);
                return min.cost;
            }

            for (int j = 0; j < N; j++) {
                if (!min.assigned[j]) {
                    Node child = newNode(i, j, min.assigned, min);
                    child.pathCost = min.pathCost + costMatrix[i][j];
                    child.cost = child.pathCost + calculateCost(costMatrix, i, j, child.assigned);
                    pq.add(child);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int costMatrix[][] = {
                {9, 2, 7, 8},
                {6, 4, 3, 7},
                {5, 8, 1, 8},
                {7, 6, 9, 4}
        };
        System.out.println("\nOptimal Cost is " + findMinCost(costMatrix));
    }
}
