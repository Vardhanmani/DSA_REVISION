import java .util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm=new LinkedHashMap<>();
        lhm.put("shidou", 100);
        lhm.put("mani", 100);
        lhm.put("sai", 20);
        lhm.put("rasheed", 50);

        System.out.println(lhm);
    }
}
