// Superclass: Device
class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass: Thermostat (Extends Device)
class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main Class
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("T123", "ON", 22);

        // Display the status of the thermostat
        thermostat.displayStatus();
    }
}
