import java.util.ArrayList;
import java.util.List;

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

        // Display bogies
        System.out.println("\nPassenger Bogies:");
        passengerBogies.forEach(System.out::println);

        // Calculate total seating capacity using stream + map + reduce
        int totalSeats = passengerBogies.stream()
                .map(Bogie::getCapacity)       // extract capacity of each bogie
                .reduce(0, Integer::sum);      // sum all capacities

        // Display total seating capacity
        System.out.println("\nTotal Seating Capacity in Train: " + totalSeats + " seats");
    }
}