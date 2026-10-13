package Midterm_13102026;

public class User {
    protected UserProfile profile;

    public User(UserProfile profile) {
        this.profile = profile;
    }

    public void logIn(int userId, int password) {
        System.out.println("User dengan ID " + userId + " berhasil Log In.");
    }

    public void recoverPassword() {
        System.out.println("Instruksi pemulihan password telah dikirim ke email.");
    }

    public void logOut() {
        System.out.println("User berhasil Log Out.");
    }
}
