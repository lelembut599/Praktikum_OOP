package Posttest_2;

public class Motor {
    private String id;  // Menggunakan access modifier private
    private String merk;
    private String tipe;
    private double hargaSewa;

    public Motor(String id, String merk, String tipe, double hargaSewa) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Merk: " + merk + ", Tipe: " + tipe + ", Harga Sewa: " + hargaSewa;
    }
}
