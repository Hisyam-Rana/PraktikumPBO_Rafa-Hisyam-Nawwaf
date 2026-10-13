package MidTermExam_13102026;

public class DemoUser19 {
    public static void main(String[] args) {
        UserProfile prof = new UserProfile(101, "sup3rs3m4r", "Gerung", 20, "rocky@mail.com", "ktp.png");

        Customer cust = new Customer(prof);
        cust.logIn(prof.getUser_id(), 123);
        cust.applyVerification("png");
        System.out.println("Status Verifikasi Customer: " + cust.getVerificationStatus());
        cust.logOut();

        System.out.println("-----------------------------------");

        Admin admin = new Admin(new UserProfile(99, "kominfo123", "Wowok", 30, "RI03@mail.com", "id.pdf"));
        admin.addVehicle();
        admin.retrieveComplain();
        admin.verifyUser();
    }
}
