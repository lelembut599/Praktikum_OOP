package Posttest_3;

public class MotorBebek extends Motor {
    private boolean iritBbm;

    public MotorBebek(String id, String merk, String tipe, double hargaSewa, boolean iritBbm) {
        super(id, merk, tipe, hargaSewa);
        this.iritBbm = iritBbm;
    }

    public boolean isIritBbm() {
        return iritBbm;
    }

    public void setIritBbm(boolean iritBbm) {
        this.iritBbm = iritBbm;
    }

    @Override
    public String toString() {
        return super.toString() + ", Irit BBM: " + (iritBbm ? "Ya" : "Tidak");
    }
}
