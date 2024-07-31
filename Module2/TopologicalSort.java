package Module2;

import java.util.*;

public class TopologicalSort {

    public static List<Integer> TSort(List<List<Integer>> adj, int V){
        int[] inDegree = new int[V];

        for (List<Integer> list : adj){
            for (int vertex: list){
                inDegree[vertex]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < V; i++){
            if (inDegree[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            for (int adjacent : adj.get(node)){
                inDegree[adjacent]--;
                if (inDegree[adjacent] == 0){
                    q.add(adjacent);
                }
            }
        }

        if (result.size() != V){
            System.out.println("Graph contains cycles!");
            return new ArrayList<>();
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> edges = Arrays.asList(
                Arrays.asList(0, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 1),
                Arrays.asList(1, 0)
        );
        List<List<Integer>> adj =  new ArrayList<>();

        for (int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for (List<Integer> edge : edges){
            adj.get(edge.get(0)).add(edge.get(1));
        }

        System.out.println("Topological sorting of graph: ");
        List<Integer> result = TSort(adj, n);
        for (int vertex : result){
            System.out.print(vertex+" ");
        }
    }
}
