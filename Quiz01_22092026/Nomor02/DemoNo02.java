public class DemoNo02 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("         SISTEM MANAJEMEN BENGKEL MAJU            ");
        System.out.println("==================================================\n");

        Employee mechanic1 = new Employee("EMP-01", "Rudi Hartono", "Teknisi Utama");

        Service serviceTuneUp = new Service("Tune Up Machine", 150000);
        Service serviceGantiOli = new Service("Ganti Oli Mesin", 75000);

        Customer customer1 = new Customer("Ahmad Fauzi", "081234567890");
        Customer customer2 = new Customer("Siti Rahma", "089876543210");

        Vehicle car1 = new Vehicle("N 1234 AB", "Toyota", "Avanza", "Car");
        Vehicle car2 = new Vehicle("B 5678 CD", "Honda", "CR-V", "Car");
        Vehicle motor1 = new Vehicle("N 9999 XX", "Honda", "Vario 150", "Motorcycle");
        Vehicle motor2 = new Vehicle("L 1111 YY", "Yamaha", "NMAX", "Motorcycle");

        customer1.addVehicle(car1);
        customer1.addVehicle(motor1);

        customer2.addVehicle(car2);
        customer2.addVehicle(motor2);

        displayServiceRecord(customer1, car1, serviceTuneUp, mechanic1);
        displayServiceRecord(customer1, motor1, serviceGantiOli, mechanic1);

        displayServiceRecord(customer2, car2, serviceTuneUp, mechanic1);
        displayServiceRecord(customer2, motor2, serviceGantiOli, mechanic1);
    }

    private static void displayServiceRecord(Customer customer, Vehicle vehicle, Service service, Employee employee) {
        double totalCost = vehicle.calculateTotalCost(service);

        System.out.println("--------------------------------------------------");
        System.out.println("Nama Pelanggan   : " + customer.getName() + " (" + customer.getPhoneNumber() + ")");
        System.out.println("Teknisi Penanggung : " + employee.getName() + " [" + employee.getRole() + "]");
        System.out.println("Kendaraan        : " + vehicle.getBrand() + " " + vehicle.getModel() + 
                        " [" + vehicle.getVehicleType() + "]");
        System.out.println("Plat Nomor       : " + vehicle.getPlateNumber());
        System.out.println("Layanan          : " + service.getServiceName());
        System.out.println("Biaya Servis     : Rp" + String.format("%,.0f", service.getServicePrice()));
        System.out.println("Biaya Penanganan : Rp" + String.format("%,.0f", vehicle.getServiceFee()) + 
                        " (" + vehicle.getVehicleType() + " Fee)");
        System.out.println("TOTAL ESTIMASI   : Rp" + String.format("%,.0f", totalCost));
        System.out.println("--------------------------------------------------\n");
    }
}

