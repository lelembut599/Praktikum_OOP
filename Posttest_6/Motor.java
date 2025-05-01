package Posttest_6;

public abstract class Motor implements InfoMotor {
    private final String id;
    private String merk;
    private String tipe;
    private double hargaSewa;

    public Motor(String id, String merk, String tipe, double hargaSewa) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewa = hargaSewa;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(getInfo());
    }

    @Override
    public String getInfo() {
        return "ID: " + id + ", Merk: " + merk + ", Tipe: " + tipe + ", Harga Sewa: Rp" + hargaSewa;
    }

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
}

