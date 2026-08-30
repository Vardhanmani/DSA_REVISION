import java.util.*;

public class HashMapOperationsDemo {
    public static void main(String[] args) {
        
        // Create an empty HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. put() - Adds key-value pairs into the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Mango", 30);
        System.out.println("1. After put(): " + map);

        // 2. get() - Retrieves the value associated with a specific key
        int bananaPrice = map.get("Banana");
        System.out.println("2. get('Banana'): " + bananaPrice);

        // 3. containsKey() - Checks if a key exists in the map (returns true/false)
        if (map.containsKey("Apple")) {
            System.out.println("3. containsKey('Apple'): Yes, it's in the map!");
        }

        // 4. remove() - Deletes a key-value pair from the map
        map.remove("Mango");
        System.out.println("4. After remove('Mango'): " + map);

        // 5. size() - Returns how many key-value pairs are currently in the map
        int totalSize = map.size();
        System.out.println("5. size(): " + totalSize);

        // 6. keySet() - Returns a Set of all the keys, which we can loop through
        System.out.print("6. keySet() loop: ");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}