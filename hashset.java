import java .util.*;
public class hashset {
    public static boolean HashSet(int arr[]){
        HashSet<Integer> map = new HashSet<>();
        for(int num : arr){
            if(map.contains(num)){
                return true;
            }
            map.add(num);
        }
        return false;
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,4,1};
        boolean result = HashSet(arr);
        System.out.print(result);
    }
}
