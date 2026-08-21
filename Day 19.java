//--------------------------------------------------------------Graph representation using adjacency matrix-----------------------------------------------------
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int V = obj.nextInt();
        int E = obj.nextInt();
        int[][] adj = new int[V][V];
        int[] deg = new int[V];
        for (int i = 0; i < E; i++) {
            int u = obj.nextInt();
            int v = obj.nextInt();
            adj[u][deg[u]++] = v;
            adj[v][deg[v]++] = u;
        }
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < deg[i]; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//---------------------------------------------------------------Graph representation using adjacency matrix-----------------------------------------------------
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int V = obj.nextInt();
        int E = obj.nextInt();
        int[][] matrix = new int[V][V];
        for (int i = 0; i < E; i++) {
            int u = obj.nextInt();
            int v = obj.nextInt();
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//------------------------------------------------------------BFS using Adjacency Matrix----------------------------------------------------------------
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int[] queue;
    static int front, rear;

    static void bfs(int start, int V) {
        visited[start] = true;
        queue[rear++] = start;
        while (front < rear) {
            int v = queue[front++];
            System.out.print(v + " ");
            for (int i = 0; i < V; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int V = obj.nextInt();
        int E = obj.nextInt();
        graph = new int[V][V];
        visited = new boolean[V];
        queue = new int[V];
        front = rear = 0;
        for (int i = 0; i < E; i++) {
            int u = obj.nextInt();
            int v = obj.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        bfs(0, V);
        obj.close();
    }
}

//-----------------------------------------------------------------DFS using Adjacency matrix------------------------------------------------------------
import java.util.*;
class Main {
    static int[][] graph;
    static boolean[] visited;
    static void dfs(int n, int V) {
        visited[n] = true;
        System.out.print(n + " ");
        for (int i = 0; i < V; i++) {
            if (graph[n][i] == 1 && !visited[i]) {
                dfs(i, V);
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int V = obj.nextInt();
        int E = obj.nextInt();
        graph = new int[V][V];
        visited = new boolean[V];
        for (int i = 0; i < E; i++) {
            int u = obj.nextInt();
            int v = obj.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        dfs(0, V);
    }
}
