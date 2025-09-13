import java.util.*;
public class Enhancedforloop {
    public static void main(String[] args) {
        HashSet<Integer> in=new HashSet<>();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);

        for (Integer num : in) {
            // You can use 'num' here
            System.out.println(num);
        }
    }

}
