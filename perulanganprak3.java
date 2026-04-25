import java.util.Scanner;

public class perulanganprak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int batas = 0;

        System.out.print("Masukkan Bilangan Ganjil : ");
        batas = sc.nextInt();

        int tengah = (batas / 2);

        if (batas % 2 != 0) {
            for (int a = 1; a <= batas; a++) {
                System.out.print(a);
            }

            System.out.println();

            for (int j = 1; j <= batas; j++) {
                for (int k = 1; k <= tengah; k++) {
                    System.out.print(" ");
                }
                System.out.println(j);
            }

            for (int a = 1; a <= batas; a++) {
                System.out.print(a);
            }

        } else {
            System.out.println("Bilangan bukan ganjil");
        }

        sc.close();
    }
}
