package Posttest_4;


public class MotorBebek extends Motor {
    public MotorBebek(String id, String merk, double hargaSewa) {
        super(id, merk, "Bebek", hargaSewa);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[BEBEK] " + super.toString());
    }
}
