package Midterm_13102026;

public class Admin extends User {
    public Admin(UserProfile profile) {
        super(profile);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Admin memperbarui detail kendaraan dengan ID: " + vehicleId);
    }

    public void addVehicle() {
        System.out.println("Kendaraan baru berhasil ditambahkan.");
    }

    public void retrieveComplain() {
        System.out.println("Mengambil daftar keluhan dari sistem.");
    }

    public void verifyUser() {
        System.out.println("Pengguna telah diverifikasi oleh Admin.");
    }
}
