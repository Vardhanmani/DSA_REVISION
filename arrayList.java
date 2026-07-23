import java.util.*;
public class arrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);
        System.out.println(list.get(1));
        list.remove(3);
        System.out.println(list.size());
        System.out.print(list.get(3));
        
    }
}
