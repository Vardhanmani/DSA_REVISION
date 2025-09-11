import java .util.*;

public class iteration {
   public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //add 
        hm.put("bankai", 100);
        hm.put("arise", 80);
        hm.put("ego", 100);
        hm.put("shadow", 10);

        //iteration
        Set<String> Keys = hm.keySet();
        System.out.println(Keys);

        for (String k : Keys) {
            System.out.println("key->"+k+" "+"value->"+hm.get(k));
        }
   }
}
