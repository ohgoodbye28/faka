import java.util.Scanner;

public class prak3 {
    static double a, b;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        int menu;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        System.out.println("-----pilihlah metode berikut-----");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. x");
        System.out.println("4. :");
        System.out.print("Pilih metode : ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                hasil = tambah(angka1, angka2);
                break;
            case 2:
                hasil = kurang(angka1, angka2);
                break;

            case 3:
                hasil = kali(angka1, angka2);
                break;

            case 4:
                hasil = bagi(angka1, angka2);
                break;
        }

    }

    static double tambah(double a, double b) {
        double hasil = a + b;
        System.out.print("Hasil penambahan " + a + " + " + b + "= " + hasil);
        return hasil;
    }

    static double kurang(double a, double b) {
        double hasil = a - b;
        System.out.print("Hasil pengurangan " + a + " - " + b + "= " + hasil);
        return hasil;
    }

    static double kali(double a, double b) {
        double hasil = a * b;
        System.out.print("Hasil pengalian " + a + " x " + b + "= " + hasil);
        return hasil;
    }

    static double bagi(double a, double b) {
        double hasil = a / b;
        System.out.print("Hasil pembagian " + a + " : " + b + "= " + hasil);
        return hasil;
    }

}
