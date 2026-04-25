import java.util.Scanner;
public class kuis1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int darah = 0;
        int batas = 1000;
        int total = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Pemeriksaan pasien ke-" + i);

            System.out.println("Masukkan hasil darah pasien: ");
            darah = input.nextInt();

            System.out.println("Hasil darah pasien adalah: " + darah + "mg/dL");

            //total = total + darah 
            total += darah;

            if (batas > total) {
                System.out.println("Alat masih berjalan dengan normal");
                System.out.println("-----------------------");
            } else {
                System.out.println("Mohon maaf, alat sedang rusak dan akan diperbaiki");
                break;
            }
        }
    }
}
