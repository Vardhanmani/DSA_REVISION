import java .util.*;
public class sizeisemptyisclear {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //add 
        hm.put("bankai", 100);
        hm.put("arise", 80);
        hm.put("ego", 100);
        hm.put("shadow", 10);

        System.out.println(hm +" ->");
        //remove 
        System.out.println(hm.remove("shadow"));

        System.out.println(hm);

        //is empty

        System.out.println(hm.isEmpty());

        // is clear
         
        hm.clear();
        //is size
        System.out.println(hm.size());
}
}

