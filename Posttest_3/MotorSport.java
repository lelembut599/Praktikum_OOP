package Posttest_3;

public class MotorSport extends Motor {
    private int cc;

    public MotorSport(String id, String merk, String tipe, double hargaSewa, int cc) {
        super(id, merk, tipe, hargaSewa);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kapasitas Mesin: " + cc + "cc";
    }
}
