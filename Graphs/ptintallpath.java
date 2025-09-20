import java .util.*;
public class ptintallpath {
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
      graph[0].add(new Edge(0, 3));

      graph[2].add(new Edge(2, 3));

      graph[3].add(new Edge(3, 1));
      
      graph[4].add(new Edge(4, 0));
      graph[4].add(new Edge(4, 1));

      graph[5].add(new Edge(5, 0));
      graph[5].add(new Edge(5, 2));


    }
    public static void printAllpath(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path + src);
            return;
        }
        //neibhor
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllpath(graph, e.dest, dest, path + src);
        }
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>[] graph =new ArrayList[v];
        creategraph(graph);
        int src=5;
        int dest=1;
        printAllpath(graph, src, dest, "");
    }
}
