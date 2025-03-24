package Posttest_1;

public class Motor {
    String id;
    String merk;
    String tipe;
    double hargaSewa;

    public Motor(String id, String merk, String tipe, double hargaSewa) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Merk: " + merk + ", Tipe: " + tipe + ", Harga Sewa: " + hargaSewa;
    }
}
