import java.util.Scanner;
public class tiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] kategori = new String [0];
        int[] jmlTiket = new int [0];
        int[] harga = new int [0];
        int [] jmlBeli = new int [0];
        int total = 0, menu = 0, jmlData = 0, totalTiket = 0;

        do {
            System.out.println("-----Selamat datang di Zootopia Tiket-----");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah beli");
            System.out.println("3. Hitung total");
            System.out.println("4. Keluar program");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("-----Pemilihan kategori-----");
                    System.out.print("Jumlah data yang ingin anda inputkan: ");
                    jmlData = input.nextInt();

                    input.nextLine();

                    // deklarasi ulang array
                    kategori = new String[jmlData];
                    harga = new int[jmlData];

                    // input output array menggunakan loop
                    // indeks array harus dimulai dari 0
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.print("input kategori: ");
                        kategori[i] = input.nextLine();
                        System.out.print("input harga: ");
                        harga[i] = input.nextInt();
                        input.nextLine();
                        System.out.println();
                    }
                    // output
                    for (int i = 0; i < harga.length; i++) {
                        System.out.println("kategori ke-" + (i + 1) + ": " + kategori[i]);
                        System.out.println("harga ke-" + (i + 1) + ": " + harga[i]);
                        System.out.println();
                    }  
                    break;
                case 2:
                    System.out.println("-----Jumlah tiket anda-----");
                    jmlTiket = new int [jmlData];

                    for (int i = 0; i < jmlData; i++) {
                        System.out.print("Inputkan jumlah tiket yang anda beli untuk kategori: " + kategori[i] + " pada harga Rp" + harga[i] + ": ");
                        jmlTiket[i] = input.nextInt();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("-----Penghitungan total bayar-----");
                    for (int i = 0; i < jmlData; i++) {
                    total += jmlTiket[i] * harga[i];
                    totalTiket += jmlTiket[i];
                    }

                    System.out.println("Total jumlah tiket anda adalah: " + totalTiket);
                    System.out.println("Total bayar anda adalah: Rp" + total);
                    break;

                case 4:
                    System.out.println("terimakasih telah berkunjung");
                    System.exit(0);
                    break;
            }
        } while (true);

    }
}
