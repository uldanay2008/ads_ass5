import java.util.Arrays;

class Graph {
    int vertices;
    int[][] matrix;

    Graph(int v) {
        vertices = v;
        matrix = new int[v][v];
    }

    void addEdge(int source, int destination, int weight) {
        matrix[source][destination] = weight;
        matrix[destination][source] = weight; 
    }

    void dijkstra(int start) {
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        for (int i = 0; i < vertices - 1; i++) {

            int min = Integer.MAX_VALUE;
            int u = -1;

            for (int j = 0; j < vertices; j++) {
                if (!visited[j] && distance[j] < min) {
                    min = distance[j];
                    u = j;
                }
            }

            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v]
                        && matrix[u][v] != 0
                        && distance[u] != Integer.MAX_VALUE
                        && distance[u] + matrix[u][v] < distance[v]) {

                    distance[v] = distance[u] + matrix[u][v];
                }
            }
        }

        System.out.println("Shortest distances from vertex " + start);

        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + i + " = " + distance[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 1);
        g.addEdge(2, 1, 2);
        g.addEdge(1, 3, 1);
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 3);

        g.dijkstra(0);
    }
}