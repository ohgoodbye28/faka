import java.util.Scanner;
public class M8 {
    //variabel class-level : variavel dibaca/digunakan di semua blok kode

    static int pj, lb;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int panjang = 0, lebar = 0;
        System.out.print("Masukkan panjang (cm): ");
        pj = input.nextInt();

        System.out.print("Masukkan lebar(cm): ");
        lb = input.nextInt();
        System.out.println();

        //memanggil fungsi
        System.out.println("Luas rudal mas gatot = " + hitungLuas() + " cm");




    }
    
    //memanggil fungsi harus di dalam void main
    //membuat fungsi harus di luar void main
    
    static int hitungLuas (int p, int l){
        int luas = p * l;
        return luas;
    }

    //fungsi hitung luas tanpa parameter
    static int hitungLuas (){
        //variabel global >> class level
        int luas = pj * lb;
        return luas;
    }

}


