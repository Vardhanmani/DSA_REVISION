import java.util.*;
public class minMax {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
             if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
