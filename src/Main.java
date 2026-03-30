import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create a HashMap to store bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert capacities for passenger bogies
        bogieCapacityMap.put("Sleeper", 72);      // 72 seats
        bogieCapacityMap.put("AC Chair", 54);     // 54 seats
        bogieCapacityMap.put("First Class", 36);  // 36 seats

        // Display bogie and capacity details
        System.out.println("\nBogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }
}