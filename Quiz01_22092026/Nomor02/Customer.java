import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phoneNumber;
    private List<Vehicle> vehicles;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehicles = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public List<Vehicle> getVehicles() { return vehicles; }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
}
