import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    // Goods Bogie Class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }

        public String toString() {
            return type + " Bogie carrying " + cargo;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Safety validation using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train formation is SAFETY COMPLIANT");
        } else {
            System.out.println("Train formation is NOT SAFE");
        }
    }
}