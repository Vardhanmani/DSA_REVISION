import java .util.*;
public class gethashfunction {
     public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //add 
        hm.put("bankai", 100);
        hm.put("arise", 80);
        hm.put("ego", 100);
        hm.put("shadow", 10);

        System.out.println(hm +" ->");
        
          //get function

        int j=hm.get("ego");
         System.out.println(j);
    }
}
