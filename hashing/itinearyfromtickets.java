

import java.util.HashMap;

public class itinearyfromtickets {

    // Your getstart method is correct. No changes needed.
    public static String getstart(HashMap<String, String> tickets) {
        HashMap<String, String> revs = new HashMap<>();

        for (String key : tickets.keySet()) {
            // NOTE: Using .trim() to clean up potential whitespace issues in data
            revs.put(tickets.get(key).trim(), key);
        }
        for (String key : tickets.keySet()) {
            if (!revs.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        // Corrected the data to remove the leading space from "b"
        tickets.put("c", "b");
        tickets.put("m", "d");
        tickets.put("g", "c");
        tickets.put("d", "g");

        String start = getstart(tickets);
        System.out.print(start);

        // The for loop is unchanged as requested.
        for (String key : tickets.keySet()) {
            String nextDestination = tickets.get(start);

            // CORRECTION: Check if we have reached the end of the journey.
            if (nextDestination == null) {
                break; // Exit the loop if there's no next ticket.
            }

            // If we are not at the end, print the next step and update our location.
            System.out.print(" -> " + nextDestination);
            start = nextDestination;
        }
        System.out.println();
    }
}
