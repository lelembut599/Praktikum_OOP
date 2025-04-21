package Posttest_5;

import java.util.ArrayList;
import java.util.Scanner;

public final class MotorManager {
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

        System.out.println("Pilih Jenis Motor:");
        System.out.println("1. Matic");
        System.out.println("2. Sport");
        System.out.println("3. Bebek");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        Motor motor;
        switch (pilihan) {
            case 1:
                motor = new MotorMatic(id, merk, hargaSewa);
                break;
            case 2:
                motor = new MotorSport(id, merk, hargaSewa);
                break;
            case 3:
                motor = new MotorBebek(id, merk, hargaSewa);
                break;
            default:
                System.out.println("Pilihan tidak valid. Motor tidak ditambahkan.");
                return;
        }

        daftarMotor.add(motor);
        System.out.println("Motor berhasil ditambahkan!");
    }

    public void tampilkanMotor() {
        if (daftarMotor.isEmpty()) {
            System.out.println("Tidak ada data motor.");
        } else {
            System.out.println("\nDaftar Motor:");
            for (Motor motor : daftarMotor) {
                motor.tampilkanInfo(); // Abstract method → Polymorphism
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
