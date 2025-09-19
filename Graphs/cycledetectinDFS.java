import java .util.*;
public class cycledetectinDFS {
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
      graph[0].add(new Edge(0, 1));
      graph[0].add(new Edge(0, 2));

      graph[1].add(new Edge(1, 0));
      graph[1].add(new Edge(1, 3));

      graph[2].add(new Edge(2, 0));
      graph[2].add(new Edge(2, 4));

      graph[3].add(new Edge(3, 1));
      graph[3].add(new Edge(3, 4));

      graph[4].add(new Edge(4, 2));
      graph[4].add(new Edge(4, 3));
    }
    public static boolean iscycle(ArrayList<Edge>[] graph){
        boolean visit[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                if(iscycleutil(graph,i,visit,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean iscycleutil(ArrayList<Edge>[] graph,int curr,boolean visit[],boolean stack[]){
     visit[curr]=true;
     stack[curr]=true;
     for(int i=0;i<graph[curr].size();i++){
        Edge e= graph[curr].get(i);
        if(stack[e.dest]){
            return true;
        }
        if(!visit[e.dest]&& iscycleutil(graph, e.dest, visit, stack)){
         return true;
        }
     }
     stack[curr]=false;
     return false;
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph =new ArrayList[v];
        creategraph(graph);
        System.out.println(iscycle(graph));
    }

}
