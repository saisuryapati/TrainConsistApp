import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");

        for(String id : bogieIds){
            System.out.println(id);
        }

        // Display total unique bogies
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}