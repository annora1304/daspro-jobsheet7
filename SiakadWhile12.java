import java.util.Scanner;

public class SiakadWhile12{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nilai;
    int jml;
    int i = 0;
    System.out.print("Masukkan jumlah mahasiswa: ");
    jml = input.nextInt();
    while (i < jml) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Masukkan lagi nilai valid!");
            continue;
        } 
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
        } else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
        } else if (nilai > 65 && nilai <= 73) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
        } else if (nilai > 60 && nilai <= 65) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
        } else if (nilai > 50 && nilai <= 60) {
            System.out.println("NIlai mahasiswa ke-" + (i + 1) + " adalah C");
        } else if (nilai > 39 && nilai <= 50) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
        } else {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
        }
        i++;
    }
    }
}