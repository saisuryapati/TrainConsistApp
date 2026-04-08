// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            // Safety Rule
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe Cargo: Petroleum cannot be assigned to Rectangular Bogie");
            }

            // Assign cargo if safe
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType + " -> " + shape + " Bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment validation completed.\n");
        }
    }

    public void display() {
        System.out.println("Bogie Shape: " + shape);
        System.out.println("Cargo: " + (cargo == null ? "None" : cargo));
        System.out.println("----------------------------");
    }
}

// Main Application
public class TrainConsistApp {

    public static void main(String[] args) {

        // Safe assignment
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");
        bogie1.display();

        // Unsafe assignment
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");
        bogie2.display();

        // Program continues
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Coal");
        bogie3.display();

        System.out.println("Program continues safely after exception handling.");
    }
}