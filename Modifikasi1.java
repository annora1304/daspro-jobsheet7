public class Modifikasi1{
    public static void main(String[] args) {
        int[] nilai = {45, 60, 30, 90, 75};  
        int tertinggi = 0;  
        int terendah = 100; 
        int jumlahLulus = 0;    
        int jumlahTidakLulus = 0;
        int batasKelulusan = 60;  

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            } 
            if (nilai[i] >= batasKelulusan) {
                jumlahLulus++;  
            } else {
                jumlahTidakLulus++;  
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }
}
