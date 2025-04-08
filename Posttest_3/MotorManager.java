package Posttest_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorManager {
    private ArrayList<Motor> daftarMotor = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahMotor() {
        System.out.print("Masukkan ID Motor: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Merk Motor: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan Harga Sewa: ");
        double hargaSewa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Pilih Tipe Motor:");
        System.out.println("1. Motor Bebek");
        System.out.println("2. Motor Sport");
        System.out.println("3. Motor Matic");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Apakah Irit BBM? (true/false): ");
                boolean irit = scanner.nextBoolean();
                scanner.nextLine();
                daftarMotor.add(new MotorBebek(id, merk, "Bebek", hargaSewa, irit));
                break;
            case 2:
                System.out.print("Masukkan Kapasitas Mesin (cc): ");
                int cc = scanner.nextInt();
                scanner.nextLine();
                daftarMotor.add(new MotorSport(id, merk, "Sport", hargaSewa, cc));
                break;
            case 3:
                System.out.print("Apakah Memiliki Bagasi Besar? (true/false): ");
                boolean bagasi = scanner.nextBoolean();
                scanner.nextLine();
                daftarMotor.add(new MotorMatic(id, merk, "Matic", hargaSewa, bagasi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Motor berhasil ditambahkan!");
    }

    public void tampilkanMotor() {
        if (daftarMotor.isEmpty()) {
            System.out.println("Tidak ada data motor.");
        } else {
            System.out.println("\nDaftar Motor:");
            for (Motor motor : daftarMotor) {
                System.out.println(motor);
            }
        }
    }

    public void perbaruiMotor() {
        System.out.print("Masukkan ID Motor yang akan diperbarui: ");
        String id = scanner.nextLine();

        for (Motor motor : daftarMotor) {
            if (motor.getId().equals(id)) {
                System.out.print("Masukkan Merk Baru: ");
                motor.setMerk(scanner.nextLine());
                System.out.print("Masukkan Tipe Baru: ");
                motor.setTipe(scanner.nextLine());
                System.out.print("Masukkan Harga Sewa Baru: ");
                motor.setHargaSewa(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Data motor berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Motor dengan ID tersebut tidak ditemukan.");
    }

    public void hapusMotor() {
        System.out.print("Masukkan ID Motor yang akan dihapus: ");
        String id = scanner.nextLine();

        for (Motor motor : daftarMotor) {
            if (motor.getId().equals(id)) {
                daftarMotor.remove(motor);
                System.out.println("Data motor berhasil dihapus!");
                return;
            }
        }
        System.out.println("Motor dengan ID tersebut tidak ditemukan.");
    }
}
