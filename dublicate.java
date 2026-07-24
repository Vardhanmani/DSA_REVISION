import java.util.*;
public class dublicate {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        list.add(1); list.add(1);
        list.add(2); list.add(2);
        list.add(3); list.add(3);
        list.add(4); list.add(4);

        int start = 0;
        for(int i=0; i<=list.size()-1;i++){
            if(!list.get(start).equals(list.get(i))){
                result.add(list.get(start));
                start = i;
            }
        }
        result.add(list.get(start));
        System.out.print(result);
    }
}
