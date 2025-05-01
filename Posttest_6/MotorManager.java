package Posttest_6;

import java.util.ArrayList;
import java.util.Scanner;

public final class MotorManager {
    private ArrayList<Motor> daftarMotor = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static int totalMotor = 0;

    public void tambahMotor() {
        try {
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
            totalMotor++;
            System.out.println("Motor berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat input data: " + e.getMessage());
            scanner.nextLine();
        }
    }

    public void tampilkanMotor() {
        if (daftarMotor.isEmpty()) {
            System.out.println("Tidak ada data motor.");
        } else {
            System.out.println("\nDaftar Motor:");
            for (Motor motor : daftarMotor) {
                motor.tampilkanInfo();
            }
        }
    }

    public void perbaruiMotor() {
        try {
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
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memperbarui motor: " + e.getMessage());
        }
    }

    public void hapusMotor() {
        try {
            System.out.print("Masukkan ID Motor yang akan dihapus: ");
            String id = scanner.nextLine();

            for (Motor motor : daftarMotor) {
                if (motor.getId().equals(id)) {
                    daftarMotor.remove(motor);
                    totalMotor--;
                    System.out.println("Data motor berhasil dihapus!");
                    return;
                }
            }
            System.out.println("Motor dengan ID tersebut tidak ditemukan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menghapus motor: " + e.getMessage());
        }
    }

    public static int getTotalMotor() {
        return totalMotor;
    }
}
