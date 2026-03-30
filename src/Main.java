import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));
        passengerBogies.add(new Bogie("Sleeper", 70));
        passengerBogies.add(new Bogie("AC Chair", 55));

        // Display original list
        System.out.println("\nOriginal Passenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // Group bogies by type/name using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = passengerBogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Display grouped bogies
        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, bogies) -> {
            System.out.println(type + ":");
            bogies.forEach(b -> System.out.println("  " + b));
        });

        // Verify original list remains unchanged
        System.out.println("\nOriginal List Remains Unchanged:");
        passengerBogies.forEach(System.out::println);
    }
}