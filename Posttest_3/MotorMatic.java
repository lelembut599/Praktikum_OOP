package Posttest_3;

public class MotorMatic extends Motor {
    private boolean bagasiBesar;

    public MotorMatic(String id, String merk, String tipe, double hargaSewa, boolean bagasiBesar) {
        super(id, merk, tipe, hargaSewa);
        this.bagasiBesar = bagasiBesar;
    }

    public boolean isBagasiBesar() {
        return bagasiBesar;
    }

    public void setBagasiBesar(boolean bagasiBesar) {
        this.bagasiBesar = bagasiBesar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bagasi Besar: " + (bagasiBesar ? "Ya" : "Tidak");
    }
}
