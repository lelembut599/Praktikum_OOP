package Posttest_4;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorManager {
    private ArrayList<Motor> daftarMotor = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Overloading 1: Input dari pengguna
    public void tambahMotor() {
        System.out.println("Pilih Jenis Motor:");
        System.out.println("1. Matic");
        System.out.println("2. Sport");
        System.out.println("3. Bebek");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan ID Motor: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Merk Motor: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan Harga Sewa: ");
        double hargaSewa = scanner.nextDouble();
        scanner.nextLine();

        Motor motor;

        if (pilihan == 1) {
            motor = new MotorMatic(id, merk, hargaSewa);
        } else if (pilihan == 2) {
            motor = new MotorSport(id, merk, hargaSewa);
        } else if (pilihan == 3) {
            motor = new MotorBebek(id, merk, hargaSewa);
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        daftarMotor.add(motor);
        System.out.println("Motor berhasil ditambahkan!");
    }

    // Overloading 2: Tambah motor lewat parameter (untuk testing atau pre-load data)
    public void tambahMotor(Motor motor) {
        daftarMotor.add(motor);
        System.out.println("Motor berhasil ditambahkan dari method overloading!");
    }

    public void tampilkanMotor() {
        if (daftarMotor.isEmpty()) {
            System.out.println("Tidak ada data motor.");
        } else {
            System.out.println("\nDaftar Motor:");
            for (Motor motor : daftarMotor) {
                motor.tampilkanInfo(); // Polymorphism: tergantung subclass mana
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

