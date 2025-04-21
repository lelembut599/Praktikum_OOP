package Posttest_5;

public abstract class Motor {
    private final String id; // final variable
    private String merk;
    private String tipe;
    private double hargaSewa;

    public Motor(String id, String merk, String tipe, double hargaSewa) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    public Motor(String id, String merk, double hargaSewa) {
        this(id, merk, "Umum", hargaSewa);
    }

    // Abstract method → wajib di-override di subclass
    public abstract void tampilkanInfo();

    public String getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // final method (tidak bisa di-override)
    public final String formatInfo() {
        return "ID: " + id + ", Merk: " + merk + ", Tipe: " + tipe + ", Harga Sewa: Rp" + hargaSewa;
    }

    @Override
    public String toString() {
        return formatInfo();
    }
}
