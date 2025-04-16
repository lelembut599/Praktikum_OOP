package Posttest_4;

public class MotorMatic extends Motor {
    public MotorMatic(String id, String merk, double hargaSewa) {
        super(id, merk, "Matic", hargaSewa);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[MATIC] " + super.toString());
    }
}
