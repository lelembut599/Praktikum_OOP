package Posttest_5;


public class MotorSport extends Motor {
    public MotorSport(String id, String merk, double hargaSewa) {
        super(id, merk, "Sport", hargaSewa);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[SPORT] " + formatInfo());
    }
}

