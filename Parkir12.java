import java.util.Scanner;
public class Parkir12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar) : ");
            jenis = scanner.nextInt();
            if (jenis == 0) {
                System.out.println("Total pembayaran : Rp " + total);
                break;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam) : ");
                durasi = scanner.nextInt();
                total = 0;
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
                System.out.println("Total pembayaran : Rp " + total);
                total = 0;
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }
}
