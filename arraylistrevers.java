import java.util.*;
public class arraylistrevers {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int start = 0;
        int end = list.size()-1;
        while(start<end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        System.out.print(list);
    }
}