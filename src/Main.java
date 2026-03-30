import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Original list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));
        passengerBogies.add(new Bogie("Executive", 80));

        // Display original list
        System.out.println("\nOriginal Passenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // Filter bogies with capacity > 60 using Stream API
        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nPassenger Bogies with Capacity > 60:");
        highCapacityBogies.forEach(System.out::println);

        // Verify original list remains unchanged
        System.out.println("\nOriginal List Remains Unchanged:");
        passengerBogies.forEach(System.out::println);
    }
}