package MIdterm_13102026;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(UserProfile profile) {
        super(profile);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String docType) {
        System.out.println("Mengajukan verifikasi menggunakan dokumen bertipe: " + docType);
        this.verificationStatus = true;
    }
}
