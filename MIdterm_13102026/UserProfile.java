package MIdterm_13102026;

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc;

    public UserProfile(int userId, String password, String name, int age, String emailId, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }

    public int getUser_id() { 
        return userId; 
    }
    
    public String getPassword() { 
        return password; 
    }
    
    public String getName() { 
        return name; 
    }
    
    public int getAge() { 
        return age; 
    }
    
    public String getEmail() { 
        return emailId; 
    }

    public void editProfile() {
        System.out.println("Profil " + name + " berhasil diperbarui.");
    }

    public void showDocuments() {
        System.out.println("Menampilkan dokumen: " + doc);
    }
}
