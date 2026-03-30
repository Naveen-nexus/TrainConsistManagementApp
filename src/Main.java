import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // For display
    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));

        // Display unsorted bogies
        System.out.println("\nPassenger Bogies (Unsorted):");
        passengerBogies.forEach(System.out::println);

        // Sort bogies by capacity in descending order
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Display sorted bogies
        System.out.println("\nPassenger Bogies (Sorted by Capacity - High to Low):");
        passengerBogies.forEach(System.out::println);
    }
