import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input pesanan : meja, menu, nama pemesan, jenis pesanan, jumlah pesanan,
        // total
        String namaPemesan = "";
        String noMeja = "";
        String jenisPesanan = "";
        int jumlahPesan = 0, total = 0, harga = 0;

        // cek string ---> equals / equalsIgnoreCase
        // equals = case sensitive (memperhatikan kapital/non sebuah huruf)
        // equalsIgnoreCase = case non sensitive (tidak terlalu memperdulikan
        // kapital/non huruf) 
        System.out.print("Nama pemesan : ");
        namaPemesan = input.nextLine();

        System.out.println("menu mie gacoan");
        System.out.println("1. mie gacoan");
        System.out.println("2. mie hompimpa");
        System.out.println("3. mie suit");
        System.out.println("4. mie dimsum");
        System.out.println("5. es teh");
        System.out.println("pilih menu : ");

        int pilih = input.nextInt();
        input.nextLine();
        // cek kondisi dg integer
        if (pilih == 1 || pilih == 2) {
            System.out.print("pilih level : (1-8) : ");
            String level = input.nextLine();
            harga = 10000;
            System.out.print("jumlah pesan : ");
            jumlahPesan = input.nextInt();
            input.nextLine();
        } else {
            System.out.print("nama pesanan : ");
            String pesanan = input.nextLine();
        }

        System.out.println("jenis pesanan : \n 1. dine in \n 2. take away" + "\n");
        System.out.print("pilih jenis pemesanan : ");
        jenisPesanan = input.nextLine();

        // inputan dine in
        if (jenisPesanan.equalsIgnoreCase("1")) {
            System.out.print("nomor meja : ");
            noMeja = input.nextLine();
            // hitung total
            total = harga * jumlahPesan;
            System.out.println("total harga pesanan anda : Rp" + total);
        } else {
            System.out.println("-----take away-----");
            total = (harga * jumlahPesan) + 2000;
            System.out.println("total harga pesanan anda : Rp" + total);

        }
        // output

        input.close();

    }
}
