import java.util.*;
import java.util.PriorityQueue;
public class heap {
    public static void main(String args[]){
    PriorityQueue<Integer> minheap = new PriorityQueue<>();//in priorityQueue is automally put the smallest number in first
    minheap.add(30);
    minheap.add(10);
    minheap.add(20);

    //System.out.println(minheap.peek());

    while(!minheap.isEmpty()){
        System.out.println(minheap.poll());
    }
}
}
