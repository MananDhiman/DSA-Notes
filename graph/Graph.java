import java.util.*;

class Graph{
    static void adjacencyList(){
        //Graph using Adjacency List
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++)
            adj.add(new ArrayList<Integer>());


        // to connect node u to node v
        // adj.get(u).add(v)
        // adj.get(v).add(u)

        // edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i=1; i<n; i++){
            for(int j =0; j< adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    static void adjacencyMatrix(){
        //Graph using Adjacency List
        int n = 3, m = 3;

        int adj[][] = new int[n+1][n+1];

        // to connect node u to node v
        // adj[u][v] = 1;
        // adj[v][u] = 1;

        // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;
    }

    public static void main(String[] args) {

        adjacencyList();

        adjacencyMatrix();

        
    }
}