import java.util.Scanner;
public class rusak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah_pemeriksaan = 0, rusak = 0, total = 0;

        System.out.print("Masukkan jumlah pemeriksaan: ");
        jumlah_pemeriksaan = input.nextInt();

        for (int i = 1; i <= jumlah_pemeriksaan; i++ ) {
            System.out.println("Pemeriksaan ke-" + i);
        
            System.out.print("Masukkan jumlah barang rusak: ");
            rusak = input.nextInt();

            total += rusak;
            
            if (rusak > 0) {
                System.out.println("---------------------");
                System.out.println("Masukkan lagi jika ada barang rusak");
            } else {
                System.out.println("Terimakasih telah melaporkan");
                break;
            }
        }
        System.out.println("---------------------");
        System.out.print("Total barang rusak adalah: " + total);
    }
}
