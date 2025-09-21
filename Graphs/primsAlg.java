import java.util.*;
public class primsAlg {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

        
        
    }
    static class pair implements Comparable<pair>{
        int v;
        int cost;

        public pair(int v,int c){
            this.v=v;
            this.cost=c;

        }
        @Override
        public int compareTo(pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void prims(ArrayList<Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(0, 0));
        int finalcost=0;
        while (!pq.isEmpty()) {
            pair curr=pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v]=true;
                finalcost+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    if(!vis[e.dest]) {
                        pq.add(new pair(e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println(finalcost);
    }
    public static void main(String[] args) {
             int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        creategraph(graph);
        int src = 0; // Define the source vertex, e.g., 0
        prims(graph);
    }

    
}
