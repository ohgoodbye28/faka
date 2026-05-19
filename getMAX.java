import java.util.Scanner;
public class getMAX {
    static int MAX;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        System.out.print("Masukkan jumlah angka: ");
        n = input.nextInt();

        int[] MAX = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            MAX[i] = input.nextInt();
        }
        
        System.out.println("Nilai terbesar adalah: " + getNilaiMax(MAX));

    }
      public static int getNilaiMax(int MAX[]) {
      int nilai_max = MAX[0];

        for (int i = 1; i < MAX.length; i++) {
            if (MAX[i] > nilai_max) {
                nilai_max = MAX[i];
            }
        }
        return nilai_max;
    }
}

