package Jobsheet09_27102026;

public class SmartFridge extends Kulkas implements Audible {
    private int volume;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void naikkanVolume(int increment) {
        this.volume += increment;
    }

    @Override
    public void turunkanVolume(int decrement) {
        this.volume -= decrement;
    }

    @Override
    public String getInfo() {
        return "SmartFridge [Merk: " + getMerk() + ", Warna: " + getWarna() + ", Harga: " + getHarga() + ", Jumlah Pintu: " + getJumlahPintu() + ", Volume: " + volume + "]";
    }
}