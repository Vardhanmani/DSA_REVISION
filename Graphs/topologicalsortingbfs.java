import java .util.*;

public class topologicalsortingbfs {
    static class Edge{
        int scr;
        int dest;

        public Edge(int scr,int dest){
            this.scr=scr;
            this.dest=dest;
        }
    }
    public static void creategraph(ArrayList<Edge>[]graph){
      for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
      }
      
      graph[2].add(new Edge(2, 3));

      graph[3].add(new Edge(3, 1));
      
      graph[4].add(new Edge(4, 0));
      graph[4].add(new Edge(4, 1));

      graph[5].add(new Edge(5, 0));
      graph[5].add(new Edge(5, 2));


    }
   public static void calindeg(ArrayList<Edge>[]graph, int indeg[]){
    for(int i=0;i<graph.length;i++){
        int v=i;//vertex
        for(int j=0;j<graph[v].size();j++){
            Edge e=graph[v].get(j);
            indeg[e.dest]++;
        }
    }
   }    
   public static void topsortinbfs(ArrayList<Edge>[] graph){
    int indeg[]=new int[graph.length];
    calindeg(graph, indeg);
    Queue<Integer>q=new LinkedList<>();
    for(int i=0;i<indeg.length;i++){
        if(indeg[i]==0){
            q.add(i);
        }
    }    
    while(!q.isEmpty()){
        int curr=q.remove();
        System.out.println(curr);

        for(int i=0;i<graph[curr].size();i++){//nei
         Edge e=graph[curr].get(i);
         indeg[e.dest]--;
         if(indeg[e.dest]==0){
            q.add(e.dest);
         }
        }
    }
    System.out.println();
    
   }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph =new ArrayList[v];
        creategraph(graph);
   topsortinbfs(graph);
}
}
