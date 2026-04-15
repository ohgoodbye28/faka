import java.util.Scanner;
public class perulangan {
     public static void main(String[] args) {
        
        //membuat program untuk menghitung sskm berdasarkan
        //kegiatan dan poin sskm dari kegiatan yang diinputkan. kegiatan bisa diinput hingga 5 data

        //output 
        // bimbingan karir - 5 poin
        //seminar AI - 3 poin
        //total : 8 poin

        Scanner input = new Scanner (System.in);

        String  namaKegiatan = " ";
        int pointSSKM = 0, total = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Data ke: " + i);
            System.out.print("Nama kegiatan: ");
            namaKegiatan = input.nextLine();
            System.out.print("Poin sskm: ");
            pointSSKM = input.nextInt();
            System.out.println();
            input.nextLine();
 
            total += pointSSKM;

        }
        
        System.out.println("total sskm anda adalah: " + total);
        
     }
}
