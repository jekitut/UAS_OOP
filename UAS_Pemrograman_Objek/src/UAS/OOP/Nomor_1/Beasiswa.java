package UAS.OOP.Nomor_1;

import java.util.Scanner;

public class Beasiswa {
    
    public static void main(String[] args) {
        double nilai, poin = 0, totalnilai = 0, totalpoint = 0, totalsks = 0, ipk;
        float n;
        int sks, po, i = 1;
        String nim, nama, jurusan, fakultas, mk, predikat;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("NIM              : ");
        nim = input.nextLine();
        System.out.print("NAMA             : ");
        nama = input.nextLine();
        System.out.print("JURUSAN          : ");
        jurusan = input.nextLine();
        System.out.print("FAKULTAS         : ");
        fakultas = input.nextLine();
       
        System.out.print("\nBanyak Mata Kuliah yang diambil : ");
        n = input.nextFloat();
        
        while (i <= n) {
            System.out.println("\nMata Kuliah Ke   : " + i);
            
            System.out.print("Nama Mata Kuliah : ");
            Scanner input1 = new Scanner(System.in);
            mk = input1.nextLine();
            
            System.out.print("SKS              : ");
            Scanner input2 = new Scanner(System.in);
            sks = input2.nextInt();
            
            System.out.print("Nilai            : ");
            Scanner input3 = new Scanner(System.in);
            nilai = input3.nextDouble();
            
            if (nilai >= 85) {
                predikat = "A";
                po = 4;
            } else if (nilai >= 75) {
                predikat = "B";
                po = 3;
            } else if (nilai >= 65) {
                predikat = "C";
                po = 2;
            } else if (nilai >= 50) {
                predikat = "D";
                po = 2;
            } else {
                predikat = "E";
                po = 1;
            }
            
            System.out.println("Predikat         : " + predikat);
            poin = po * sks;
            System.out.println("Total Point      : " + poin);
            totalnilai += nilai;
            totalpoint += poin;
            totalsks += sks;
            i++;
        }
        
        System.out.println("\nTotal Nilai      : " + totalnilai);
        System.out.println("Total Point      : " + totalpoint);
        System.out.println("Total SKS        : " + totalsks);
        ipk = totalpoint / totalsks;
        System.out.println("IPK              : " + ipk);
        
        if (ipk >= 3.25) {
            System.out.println("\nSELAMAT ANDA MENDAPATKAN BEASISWA");
        } else {
            System.out.println("\nMOHON MAAF ANDA TIDAK MENDAPATKAN BEASISWA");
        }
    }
    
}