import java.util.*;
public class weakestsoldier {
    static class row implements Comparable<row>{
        int sol;
        int idx;
        public row(int sol,int idx){
            this.sol=sol;
            this.idx=idx;
        }
        @Override
        public int compareTo(row r2){
            if(this .sol==r2.sol){
                return this.idx-r2.idx;
            }else{
                return this.sol-r2.sol;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<row> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[0].length;j++){
                count += arr[i][j]==1 ? 1 : 0;
            }
            pq.add(new row(count, i));
        }
        for(int i=0;i<k;i++){
            System.out.println(pq.remove().idx);
        }
    }
}
