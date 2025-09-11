import java.security.Key;
import java .util.*;

public class majorityelementsinhash {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hp=new HashMap<>();

        for(int i=0;i<arr.length ;i++){
            if(hp.containsKey(arr[i])){
                hp.put(arr[i], hp.get(arr[i])+1);
            }else{
                hp.put(arr[i], 1);
            }
        }
        Set<Integer> keySet = hp.keySet();
        for (Integer key : keySet) {
            if(hp.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }    
}
