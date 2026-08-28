import java .util.*;
public class hashing{
    public static void main (String args[]){
        HashMap<String , Integer> ages = new HashMap<>();
        ages.put("mani", 22);
        ages.put("vardhan", 23);
        ages.put("shidou", 24);
        ages.put("nagi", 25);

        System.out.println(ages.get("mani"));

        if(ages.containsKey("shodou")){
            System.out.print("shidou is in the map");
        }else{
            System.out.print("shidou is not their in the map");
        }
        //update
        ages.put("mani", 26);
        System.out.print(ages.get("mani"));
    }
}
