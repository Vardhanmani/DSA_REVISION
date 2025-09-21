import java .util.*;
public class bekllmanAlg {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int scr,int dest,int wt){
            this.src=scr;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void creategraph(ArrayList<Edge>[]graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        
        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
        
    }
    public static void Bellman(ArrayList<Edge>[] graph, int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!= src){
              dist[i]=Integer .MAX_VALUE;
            }
        }
        int V=graph.length;
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){//vertex
                for(int k=0;k<graph[j].size();k++){//edge
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    //relaxation
                    if(dist[u] !=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }
        for(int i=0; i<dist.length;i++){
            System.out.println(dist[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        creategraph(graph);
        int src = 0; // Define the source vertex, e.g., 0
        Bellman(graph, src);
    }

}
