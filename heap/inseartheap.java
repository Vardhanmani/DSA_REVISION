import java.util.*;

public class inseartheap { // It's conventional to capitalize class names, e.g., InsertHeap

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // 1. Add to last
            arr.add(data);

            int child = arr.size() - 1; // index of child

            // 2. Bubble up
            // The loop must continue as long as the child is not the root
            // AND the child's value is less than its parent's.
            while (child > 0) {
                int parent = (child - 1) / 2; // index of parent

                if (arr.get(child) < arr.get(parent)) {
                    // Swap
                    int temp = arr.get(child);
                    arr.set(child, arr.get(parent));
                    arr.set(parent, temp);

                    // Update the child to its new position (the parent's old position)
                    // and repeat the process.
                    child = parent;
                } else {
                    // If the child is not smaller than its parent, it's in the correct place.
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);
        heap.add(1); // This is the key test case

        // Correct output should be: [1, 3, 2, 5, 10, 4]
        System.out.print(heap.arr);
    }
}
