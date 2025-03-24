package Posttest_1;

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
        System.out.print("Masukkan Tipe Motor: ");
        String tipe = scanner.nextLine();
        System.out.print("Masukkan Harga Sewa: ");
        double hargaSewa = scanner.nextDouble();
        scanner.nextLine();

        daftarMotor.add(new Motor(id, merk, tipe, hargaSewa));
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
            if (motor.id.equals(id)) {
                System.out.print("Masukkan Merk Baru: ");
                motor.merk = scanner.nextLine();
                System.out.print("Masukkan Tipe Baru: ");
                motor.tipe = scanner.nextLine();
                System.out.print("Masukkan Harga Sewa Baru: ");
                motor.hargaSewa = scanner.nextDouble();
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
            if (motor.id.equals(id)) {
                daftarMotor.remove(motor);
                System.out.println("Data motor berhasil dihapus!");
                return;
            }
        }
        System.out.println("Motor dengan ID tersebut tidak ditemukan.");
    }
}
