import java.util.Scanner;
public class pulsa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] namaProvider = new String [0];
        double [] total = new double [0];
        double [] cashback = new double [0];
        String [] jenisPaket = new String [0];
        int [] nominal = new int [0];
        int  pelanggan = 0;
        int menu = 0;

       do {
            System.out.println("-----Selamat datang di Zootopia Tiket-----");
            System.out.println("1. Masukkan jumlah pelanggan");
            System.out.println("2. Masukkan nominal harga");
            System.out.println("3. perhitungan nominal");
            System.out.println("4. keluar program");
            System.out.print("Pilih menu : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("-----Pendataan pelanggan-----");
                    System.out.print("Jumlah data yang ingin anda inputkan: ");
                    pelanggan = input.nextInt();
                    input.nextLine();

        

                    namaProvider = new String[pelanggan];
                    jenisPaket = new String [pelanggan];

                    for (int i = 0; i < namaProvider.length; i++) {
                        System.out.println("inputkan nama provider: ");
                        namaProvider[i] = input.nextLine();

                        System.out.println("inputkan jenis paket: ");
                        jenisPaket[i] = input.nextLine();

                        System.out.println();
                    }
                    // output
                    for (int i = 0; i < namaProvider.length; i++) {
                        System.out.println("nama provider pelanggan ke-" + (i + 1) + ": " + namaProvider[i]);
                        System.out.println("jenis paket layanan pelanggan ke-" + (i + 1) + ": " + jenisPaket[i]);
                        System.out.println();
                    }  
                    break;
                case 2:
                    System.out.println("-----nominal harga tiket anda-----");
                    
                    nominal = new int [pelanggan];

                    System.out.println("1. Rp15.000");
                    System.out.println("2. Rp25.000");
                    System.out.println("3. Rp50.000");
                    System.out.println("4. Rp100.000");

                    for (int i = 0; i < pelanggan; i++) {
                        System.out.print("Inputkan berapa nominal pulsa yang anda pesan: "); 
                        nominal[i] = input.nextInt();
                        System.out.println();

                        if (nominal[i] == 1){
                            nominal[i] = 15000;
                        } else if (nominal[i] == 2){
                            nominal[i] = 25000;
                        } else if (nominal[i] == 3){
                            nominal[i] = 50000;
                        } else if (nominal[i] == 4){
                            nominal[i] = 100000;
                        } else {
                            nominal[i] = 0;
                        }
                    }
                    break;

                case 3:
                
                       System.out.println("-----Penghitungan total bayar-----");

                         total = new double[pelanggan];      
                         cashback = new double[pelanggan];   

                    for (int i = 0; i < pelanggan; i++) {
                     total[i] = nominal[i] + 200;

                    if(total[i] >= 100000){
                     cashback[i] = total[i] * 15 / 100;
                    } else if (total[i] >= 50000){
                     cashback[i] = total[i] * 10 / 100;
                    } else {
                     cashback[i] = 0;
                    }

                    double bayar = total[i] - cashback[i];

                    System.out.println("Total bayar pelanggan ke-" + (i+1) + ": " + bayar);
                    }
                    break;
                case 4:
                    System.out.println("terimakasih telah berkunjung");
                    System.exit(0);
                    break;
            }
        } while (true);



    }
}
