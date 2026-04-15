import java.util.Scanner;

public class transport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        // menginput nominal
        System.out.print("Masukkan jumlah penumpang: ");
        int penumpang = input.nextInt();
        System.out.println("-------------------------");

        // menghitung bus
        int bus = penumpang / 50;
        int sisa = penumpang % 50;

        // menghitung minibus
        int minibus = sisa / 15;
        sisa = sisa % 15;

        // menghitung mobil
        int mobil = sisa / 7;
        sisa = sisa % 7;

        // menghitung sisa mobil
        if (sisa != 0) {
            mobil = mobil + 1;
        }

        // output
        System.out.println("bus = " + bus);
        System.out.println("minibus = " + minibus);
        System.out.println("mobil = " + mobil);

    }
}