import java .util.*;
public class frequency {
    public static void main (String args[]){
        int arr[] = {1,2,1,3,2,1};
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int i=0;i<=arr.length-1;i++){
            int current = arr[i];
            if(freq.containsKey(current)){
                int count = freq.get(current);
                freq.put(current , count+1);
            }else{
                freq.put(current , 1);
            }
        }
        System.out.println(freq);
    }
}
