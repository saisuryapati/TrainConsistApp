import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper");

        // Display final train formation
        System.out.println("\nFinal Train Formation:");
        for(String bogie : trainFormation){
            System.out.println(bogie);
        }
    }
}