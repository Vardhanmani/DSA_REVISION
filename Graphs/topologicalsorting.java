import java .util.*;
public class topologicalsorting {
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
    public static void topsort(ArrayList<Edge>[] graph){
        boolean visit[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                topsortutil(graph,i,visit,s);
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void topsortutil(ArrayList<Edge>[] graph , int curr,boolean visit[],Stack s){
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.dest]){
                topsortutil(graph, e.dest, visit, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph =new ArrayList[v];
        creategraph(graph);
        topsort(graph);
    }

}
