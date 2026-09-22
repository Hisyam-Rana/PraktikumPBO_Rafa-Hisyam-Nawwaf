public class Vehicle {
    private String plateNumber;
    private String brand;
    private String model;
    private String vehicleType;

    public Vehicle(String plateNumber, String brand, String model, String vehicleType) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.vehicleType = vehicleType;
    }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public double calculateTotalCost(Service service) {
        double serviceFee = 0;
        if (vehicleType.equalsIgnoreCase("Car")) {
            serviceFee = 50000;
        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            serviceFee = 20000;
        }
        return service.getServicePrice() + serviceFee;
    }

    public double getServiceFee() {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return 50000;
        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            return 20000;
        }
        return 0;
    }
}
