import java.util.Scanner;

public class Faka1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menginput nominal
        System.out.print("Masukkan nominal pembayaran = ");
        int nominal = input.nextInt();
        System.out.println("-------------------------");

        // menghitung dua puluh ribu
        int duaPuluhRibu = nominal / 20000; 
        int sisa = nominal % 20000;

        // menghitung sepuluh ribu
        int sepuluhPuluhRibu = sisa / 10000;
        sisa = sisa % 10000;

        // menghitung seribuan
        int seribuan = sisa / 1000;
        sisa = sisa % 1000;

        // menghitung lima ratusan
        int limaRatus = sisa / 500;
        sisa = sisa % 500;

        // menghitung dua ratus
        int duaRatus = sisa / 200;
        sisa = sisa % 200;

        // menghitung seratusan
        int seratusan = sisa / 100;
        sisa = sisa % 100;

        // output
        System.out.println("Dua puluh ribuan = " + duaPuluhRibu);
        System.out.println("Sepuluh ribuan = " + sepuluhPuluhRibu);
        System.out.println("seribuan = " + seribuan);
        System.out.println("lima ratusan = " + limaRatus);
        System.out.println("dua ratusan = " + duaRatus);
        System.out.println("seratusan = " + seratusan);

    }
}