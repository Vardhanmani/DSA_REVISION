import java.util.*;

//connected components means like disjoint graph

public class connectedcomponents {
    
    
   static class Edge {
   int scr;
   int dest;
  

   public Edge(int scr,int dest){
    this.scr=scr;
    this.dest=dest;
   
   }
    
   }
    static void creategraph(ArrayList<Edge> graph[]){
    for(int i=0; i<graph.length; i++){
       graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 3));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 4));

    graph[3].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 4));
    graph[3].add(new Edge(3, 5));

    graph[4].add(new Edge(4, 2));
    graph[4].add(new Edge(4, 3));
    graph[4].add(new Edge(4, 5));

    graph[5].add(new Edge(5, 3));
    graph[5].add(new Edge(5, 4));
    graph[5].add(new Edge(5, 6));

    graph[6].add(new Edge(6, 5));
  
   }
   public static void BFSutil(ArrayList<Edge> graph[],boolean visit[]){
    Queue<Integer> q=new LinkedList<>();
    
    //source
    q.add(0);
    while(!q.isEmpty()){
        int curr=q.remove();
        if(!visit[curr]){
            System.out.println(curr);
            visit[curr]=true;
            //neighbour
            for(int i=0; i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                q.add(e.dest);
            }
        }
    }
   }

   public static void BFS(ArrayList<Edge>[] graph){
     boolean visit[]=new boolean[graph.length];
     for (int i=0;i<graph.length;i++){
        BFSutil(graph, visit);
     }
   }


       public static void DFSutil(ArrayList<Edge> graph[],int curr ,boolean visit[]){
        System.out.println(curr);
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                DFSutil(graph,e.dest,visit);
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph){
      boolean visit[]=new boolean[graph.length];
     for (int i=0;i<graph.length;i++){
        DFSutil(graph, i, visit);
     }  
    }

   public static void main(String[] args) {
    int v=7;
    ArrayList<Edge> graph []=new ArrayList[v];
    creategraph(graph);
    BFS(graph);
    DFS(graph);
   }
}


