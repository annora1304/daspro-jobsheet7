import java.util.Scanner;
public class percobaan3{
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaRoti = 20000;
        int totalHarga;
        do {
           System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
           namaPelanggan = input.nextLine();
           if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
           }
           System.out.print("Jumlah kopi: ");
           kopi = input.nextInt();
           System.out.print("jumlah teh: ");
           teh = input.nextInt();
           System.out.print("Jumlah roti: ");
           roti = input.nextInt();
           totalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaRoti);
           System.out.println("Total yang harus dibayar: Rp " + totalHarga);
           input.nextLine();
    
        } while (true);
        System.out.println("Semua transaksi selesai.");
 }
}