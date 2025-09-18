import java .util.*;
public class creategraph{
   static class edege {
   int scr;
   int dest;
   int we;

   public edege(int scr,int dest,int we){
    this.scr=scr;
    this.dest=dest;
    this.we=we;
   }
    
   }
   public static void main(String[] args) {
    int v=5 ;//vertex
    //create graph 
    ArrayList <edege> []graph=new ArrayList[v];
    //null->empty arraylist
    for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
    }
    //vertex=0
     graph[0].add(new edege(0,1,5));
      graph[1].add(new edege(1,0,5));
       graph[1].add(new edege(1,2,1));
        graph[1].add(new edege(1,3,3));
         graph[2].add(new edege(2,1,1));
          graph[2].add(new edege(2,3,1));
           graph[2].add(new edege(2,4,4));
            graph[3].add(new edege(3,1,3));
             graph[3].add(new edege(3,2,1));
              graph[0].add(new edege(4,2,2));

              //print 
              for(int i=0;i<graph[2].size();i++){
                edege e=graph[2].get(i);
                System.out.println(e.dest);
              }

   }
}