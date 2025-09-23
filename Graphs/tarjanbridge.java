import java .util.*;
public class tarjanbridge {
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
      graph[0].add(new Edge(0, 3));

      graph[1].add(new Edge(1, 0));
      graph[1].add(new Edge(1, 2));

      graph[2].add(new Edge(2, 0));
      graph[2].add(new Edge(2, 1));
      
      graph[3].add(new Edge(3, 0));
      graph[3].add(new Edge(3, 4));
      graph[3].add(new Edge(3, 5));

      graph[4].add(new Edge(4, 3));
      graph[4].add(new Edge(4, 5));

      graph[5].add(new Edge(5, 3));
      graph[5].add(new Edge(5, 4));
      

    }
    public static void dfs(ArrayList<Edge>[]graph,int curr,int par,int dt[],int low[],boolean visit[],int time){
        visit[curr]=true;

        dt[curr]=low[curr]=++time;

        for(int i=0;i<graph[curr].size();i++){

            Edge e =graph[curr].get(i);

            int neig=e.dest;

            if(neig==par){
                continue;

            }else if(!visit[neig]){
                dfs(graph, neig, curr, dt, low, visit, time);
                low[curr]=Math.min(low[curr], low[neig]);

                if(dt[curr]<low[neig]){
                    System.out.println("bridge"+ curr +"-----"+ neig);
                }


            }else{
                    low[curr]=Math.min(low[curr], dt[neig]);
            }       
        }
    }
    public static void Tarjanbridge (ArrayList<Edge>[]graph,int v){
        int  dt[]=new int[v];
        int low[]=new int[v];
        int time=0;
        boolean visit[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!visit[i]){
                dfs(graph, i, -1, dt, low, visit, time);
            }
        }
    }
     public static void main(String[] args){
        int v=6;
        ArrayList<Edge>[]graph=new ArrayList[v];
        creategraph(graph);
        Tarjanbridge(graph, v);
    }
 
}
