import java .util.*;
public class maxelementqueries {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static void buildtree(int i,int si,int sj,int arr[]){
        if(si==sj){
            tree[i]=arr[si];
            return;
        }
        int mid=(si+sj)/2;
        buildtree(2*i+1, si, mid, arr);
        buildtree(2*i+2, mid+1, sj, arr);
        tree[i]=Math.max(tree[2*i+1], tree[2*i+2]);
    }
    
        public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        
        init(n);

    
        buildtree(0, 0, n-1, arr);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i] +" ");
        }
    }
}
    
