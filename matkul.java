import java.util.Scanner;

public class matkul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sksBD = 3, sksUI = 3, sksSIM = 2, sksMB = 3, sksPemDig = 2, sksSisdm = 2, sksDasprog = 3, sksPrak = 3, sksIndo = 2;
                
        double BasisData = 0, UIUX = 0, SIM = 0, MatBis = 0, PemDig = 0, SISDM = 0, Dasprog = 0, Prak = 0, Indo = 0,
                nilai = 0;

        System.out.print("Masukkan nilai mata kuliah Basis Data! ");
        BasisData = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah Desain antar muka! ");
        UIUX = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah Sistem Informasi Manajemen! ");
        SIM = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah Matematika Bisnis! ");
        MatBis = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah Pemasaran Digital! ");
        PemDig = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah SI SDM! ");
        SISDM = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah Dasar Pemrograman! ");
        Dasprog = input.nextInt();

        System.out.print("Masukkan nilai mata kuliah Bahasa Indonesia! ");
        Indo = input.nextInt();

        if (BasisData >= 85) {
            BasisData = 4.00;
        } else if (BasisData >= 75) {
            BasisData = 3.50;
        } else if (BasisData >= 70) {
            BasisData = 3.00;
        } else if (BasisData >= 60) {
            BasisData = 2.50;
        } else if (BasisData >= 55) {
            BasisData = 2.00;
        } else if (BasisData >= 40) {
            BasisData = 1.00;
        } else {
            BasisData = 0;
        }

        if (UIUX >= 85) {
            UIUX = 4.00;
        } else if (UIUX >= 75) {
            UIUX = 3.50;
        } else if (UIUX >= 70) {
            UIUX = 3.00;
        } else if (UIUX >= 60) {
            UIUX = 2.50;
        } else if (UIUX >= 55) {
            UIUX = 2.00;
        } else if (UIUX >= 40) {
            UIUX = 1.00;
        } else {
            UIUX = 0;
        }

        if (SIM >= 85) {
            SIM = 4.00;
        } else if (SIM >= 75) {
            SIM = 3.50;
        } else if (SIM >= 70) {
            SIM = 3.00;
        } else if (SIM >= 60) {
            SIM = 2.50;
        } else if (SIM >= 55) {
            SIM = 2.00;
        } else if (SIM >= 40) {
            SIM = 1.00;
        } else {
            SIM = 0;
        }

        if (MatBis >= 85) {
            MatBis = 4.00;
        } else if (MatBis >= 75) {
            MatBis = 3.50;
        } else if (MatBis >= 70) {
            MatBis = 3.00;
        } else if (MatBis >= 60) {
            MatBis = 2.50;
        } else if (MatBis >= 55) {
            MatBis = 2.00;
        } else if (MatBis >= 40) {
            MatBis = 1.00;
        } else {
            MatBis = 0;
        }

        if (PemDig >= 85) {
            PemDig = 4.00;
        } else if (PemDig >= 75) {
            PemDig = 3.50;
        } else if (PemDig >= 70) {
            PemDig = 3.00;
        } else if (PemDig >= 60) {
            PemDig = 2.50;
        } else if (PemDig >= 55) {
            PemDig = 2.00;
        } else if (PemDig >= 40) {
            PemDig = 1.00;
        } else {
            PemDig = 0;
        }

        if (SISDM >= 85) {
            SISDM = 4.00;
        } else if (SISDM >= 75) {
            SISDM = 3.50;
        } else if (SISDM >= 70) {
            SISDM = 3.00;
        } else if (SISDM >= 60) {
            SISDM = 2.50;
        } else if (SISDM >= 55) {
            SISDM = 2.00;
        } else if (SISDM >= 40) {
            SISDM = 1.00;
        } else {
            SISDM = 0;
        }

        if (Dasprog >= 85) {
            Dasprog = 4.00;
        } else if (Dasprog >= 75) {
            Dasprog = 3.50;
        } else if (Dasprog >= 70) {
            Dasprog = 3.00;
        } else if (Dasprog >= 60) {
            Dasprog = 2.50;
        } else if (Dasprog >= 55) {
            Dasprog = 2.00;
        } else if (Dasprog >= 40) {
            Dasprog = 1.00;
        } else {
            Dasprog = 0;
        }

        if (Indo >= 85) {
            Indo = 4.00;
        } else if (Indo >= 75) {
            Indo = 3.50;
        } else if (Indo >= 70) {
            Indo = 3.00;
        } else if (Indo >= 60) {
            Indo = 2.50;
        } else if (Indo >= 55) {
            Indo = 2.00;
        } else if (Indo >= 40) {
            Indo = 1.00;
        } else {
            Indo = 0;
        }

        double totalSKS = 2 + 2 + 3 + 3 + 3 + 3 + 2 + 2;
        double NABD = sksBD * BasisData;
        double NAUIUX = sksUI * UIUX;
        double NASIM = sksSIM * SIM;
        double NAMB = sksMB * MatBis;
        double NAPemDig = sksPemDig * PemDig;
        double NASISDM = sksSisdm * SISDM;
        double NADasprog = sksDasprog * Dasprog;
        double NAIndo = sksIndo * Indo;

        double IP = (NABD + NAUIUX + NASIM + NAMB + NAPemDig + NASISDM + NADasprog + NAIndo) / totalSKS;

        System.out.println("Nilai IP anda semester ini adalah= " + IP);
    }
}
