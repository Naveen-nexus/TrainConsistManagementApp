import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet to store bogies (unique + ordered)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate, will be ignored

        // Display the train formation
        System.out.println("\nFinal Train Formation (in insertion order):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}