import java. util.*;
public class linerarsearch {
    public static int linerarSearch (int n[],int key){
        for(int i=0;i<=n.length-1;i++){
            if(n[i]==key){
               return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10,12,14,16};
        int key=20;
        if (linerarSearch(n, key)!=key) {
            System.out.println("NOt found");
        }else{
            System.out.println(linerarSearch(n, key));
        }
    }
}
