import java.util.Scanner;

public class percabangan_prak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batas = 0;
        System.out.print("Masukkan Bilangan Ganjil= ");
        batas = input.nextInt();

        for (int a = 1; a <= batas; a++) {
            System.out.print(a);
        }
        System.out.println();
        for (int a = 1; a <= batas; a++) {
            System.out.print(a);
            System.out.println(" ");
        }
        for (int a = 1; a <= batas; a++) {
            System.out.print(a);

        }
    }
}