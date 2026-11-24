package Jobsheet10_10112026;

public class Tenagakependidikan extends Pegawai {
    public String kategori;
    
    public Tenagakependidikan() {
    }
    
    public Tenagakependidikan(String nip, String nama, String kategori) {
        super(nip, nama);
        this.kategori = kategori;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori: " + kategori);
    }
}