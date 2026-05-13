import java.util.Scanner;

public class soalM8 {
    static int a;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan A: ");
        a = input.nextInt();

        isGanjil(a);

    }

    static boolean isGanjil (int angka){
        if (angka % 2 != 0){
            System.out.print("ganjil");
            return true;
        }else{
            System.out.print("genap");
            return false;
        }
        
    }

}
