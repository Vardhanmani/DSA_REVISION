import java.util.*;
public class iteratorinHashset {
    public static void main(String[] args) {
        HashSet<Integer> in=new HashSet<>();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);

        //iterator loop
        Iterator it=in.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}
