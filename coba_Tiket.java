import java.util.Scanner;
public class coba_Tiket {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String [] kategori = new String [0];
        int [] harga = new int [0];
        int menu = 0, total = 0;
        
        
        do {
            System.out.print("1. Masukkan kategori dan harga");
            System.out.print("2. Masukkan jumlah tiket anda");
            System.out.print("3. Penghitungan total harga");
            System.out.print("4. Keluar program");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            switch (menu){
                case 1:

                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
            }
        } while (true);
    }
}
