import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Add passenger bogies
        trainConsist.add("Sleeper Bogie");
        trainConsist.add("AC Chair Bogie");
        trainConsist.add("First Class Bogie");

        System.out.println("\nPassenger Bogies Added:");
        for(String bogie : trainConsist){
            System.out.println(bogie);
        }

        // Remove a bogie
        trainConsist.remove("AC Chair Bogie");
        System.out.println("\nAfter Removing AC Chair Bogie:");
        System.out.println(trainConsist);

        // Check existence of bogie
        if(trainConsist.contains("Sleeper Bogie")){
            System.out.println("\nSleeper Bogie exists in train consist.");
        } else {
            System.out.println("\nSleeper Bogie not found.");
        }

        // Display total bogie count
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}