import java.util.Scanner;
public class logistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah_data = 0;
        int total = 0;
        int berat_paket = 0;
        
        System.out.print("Masukkan jumlah paket anda: ");
        jumlah_data = input.nextInt();

        for(int i = 1; i <= jumlah_data; i++ ) {
            System.out.print("Masukkan berat paket ke-" + i + ": ");
            berat_paket = input.nextInt();

            total += berat_paket;
        }
        System.out.print("Total berat paket anda hari ini adalah: " + total);
    }
}
