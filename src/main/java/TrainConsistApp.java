import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    // Bogie Class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 75));
        bogies.add(new Bogie("AC Chair", 65));

        // Step 2: Stream -> map -> reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // sum all capacities

        // Step 3: Display total seating capacity
        System.out.println("Total Seating Capacity of Train: " + totalSeats);
    }
}
