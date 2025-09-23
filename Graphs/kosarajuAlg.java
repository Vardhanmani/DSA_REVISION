import java .util.*;
public class kosarajuAlg {
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
      graph[0].add(new Edge(0, 2));
      graph[0].add(new Edge(0, 3));
      graph[1].add(new Edge(1, 0));

      graph[2].add(new Edge(2, 1));
      
      graph[3].add(new Edge(3, 4));
      

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
    public static void DFS(ArrayList<Edge> graph[],int curr ,boolean visit[]){
        System.out.print(curr + " ");
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                DFS(graph,e.dest,visit);
            }
        }
    }
    

    public static void KosarajuAlg(ArrayList<Edge> [] graph,int v){
        //step=1

    Stack<Integer> s=new Stack<>();
    boolean visit[]=new boolean[v];
    for(int i=0;i<v;i++){
        if(!visit[i]){
            topsortutil(graph, i, visit, s);
        }
    }
    ArrayList<Edge>tranapose[]=new ArrayList[v];
    for(int i=0;i<graph.length;i++){
        visit[i]=false;
        tranapose[i]=new ArrayList<Edge>();

    }
    for(int i=0;i<v;i++){
        for(int j=0;j<graph[i].size();j++){
            Edge e =graph[i].get(j);
            tranapose[e.dest].add(new Edge(e.dest, e.scr));
        }
    }
    //step=3
    while (!s.isEmpty()) {
      int curr=s.pop();
      if(!visit[curr]){
        System.out.print("scc->");
        DFS(tranapose, curr, visit);
        System.out.println();
      }
    }

    
    }
    public static void main(String[] args){
        int v=5;
        ArrayList<Edge>[]graph=new ArrayList[v];
        creategraph(graph);
        KosarajuAlg(graph, v);
    }

     
   }
