// Superclass: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to be overridden
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private int loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main Class
public class TransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10);
        vehicles[2] = new Motorcycle(180, "Petrol", false);

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
        }
    }
}
