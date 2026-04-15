import java.util.Scanner;
public class prak2 {
     public static void main(String[] args) {
        
        String nama;
        String buah;

        Scanner input = new Scanner (System.in);

        System.out.print("buah apa yang disukai king nasir? ");
        buah = input.nextLine();

        if (buah.equalsIgnoreCase("pisang")) {
System.out.println("horee kamu benar, king nasir suka pisang"); 
        }
         else {
            System.out.println("maaf king nasir tidak suka " + buah);
        }

        
     }
}
