import java .util.*;
public class maxheap {
    public static void main(String args[]){
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);
        maxheap.add(30);
        maxheap.add(10);
        maxheap.add(20);
        maxheap.add(40);
        while(!maxheap.isEmpty()){
            System.out.println(maxheap.poll());
        }
    }
}
