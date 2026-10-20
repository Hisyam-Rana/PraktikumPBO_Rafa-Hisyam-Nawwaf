package Jobsheet06_29092026;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    System.out.print("Objek dari class Dosen dibuat dengan constructor berparameter");
}

    public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "NIDN    : " + nidn + "\n";

        return info;
    }
}