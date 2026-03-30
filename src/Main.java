import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies after addition:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removal:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }

        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        System.out.println("\nFinal passenger bogie list:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}