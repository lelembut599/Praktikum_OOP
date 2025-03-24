package Posttest_2;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        MotorManager manager = new MotorManager();
        Scanner scanner = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== Sistem Penyewaan Motor ===");
            System.out.println("1. Tambah Data Motor");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Perbarui Data Motor");
            System.out.println("4. Hapus Data Motor");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    manager.tambahMotor();
                    break;
                case 2:
                    manager.tampilkanMotor();
                    break;
                case 3:
                    manager.perbaruiMotor();
                    break;
                case 4:
                    manager.hapusMotor();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem penyewaan motor.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
