/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plantmain;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PlantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Plant p = new Plant();
        Anggrek anggrek = new Anggrek();
        Melati melati = new Melati();
        Mawar mawar = new Mawar();
        //String pilih;
        //Scanner pilihbunga = new Scanner(System.in);
        //pilih= pilihbunga.next();
        Scanner sc = new Scanner(System.in);
        int inp = 0;
        int pilTumbuhan = 0;
        do {
            System.out.println("Pilih Tumbuhan:");
            System.out.println("1. Anggrek:");
            System.out.println("2. Melati");
            System.out.println("3. Mawar");
            System.out.println("0. Keluar");

            System.out.print("Masukkan angka: ");
            pilTumbuhan = sc.nextInt();

            switch (pilTumbuhan) {
                case 1:
                    do {
                        System.out.println("");
                        
                        anggrek.getJenis();
                        System.out.println("Pilih Aksi:");
                        System.out.println("1. Untuk memberi air");
                        System.out.println("2. Untuk memberi pupuk");
                        System.out.println("3. Untuk jika Tidak Ingin Memberi Pupuk dan air");
                        System.out.println("0. Untuk kembali");
                        System.out.print("Masukkan angka: ");
                        inp = sc.nextInt();
                        switch (inp) {
                            case 1:
                                anggrek.beriAir();
                                break;
                            case 2:
                                anggrek.beriPupuk();
                                break;
                            case 3:
                                anggrek.membiarkantanaman();
                                break;
                        }
                        System.out.println("");
                        
                        anggrek.displayPlant();
                    } while (inp != 0);
                    break;
                case 2:
                    do {
                        System.out.println("");
                        
                        melati.getJenis();
                        System.out.println("Pilih Aksi:");
                        System.out.println("1. Untuk memberi air");
                        System.out.println("2. Untuk memberi pupuk");
                        System.out.println("3. Untuk jika Tidak Ingin Memberi Pupuk dan air");
                        System.out.println("0. Untuk kembali");
                        System.out.print("Masukkan angka: ");
                        inp = sc.nextInt();
                        switch (inp) {
                            case 1:
                                melati.beriAir();
                                break;
                            case 2:
                                melati.beriPupuk();
                                break;
                            case 3:
                                melati.membiarkantanaman();
                                break;
                        }
                        System.out.println("");
                        
                        melati.displayPlant();
                    } while (inp != 0);
                    break;
                case 3:
                    do {
                        System.out.println("");
                        
                        mawar.getJenis();
                        System.out.println("Pilih Aksi:");
                        System.out.println("1. Untuk memberi air");
                        System.out.println("2. Untuk memberi pupuk");
                        System.out.println("3. Untuk jika Tidak Ingin Memberi Pupuk dan air");
                        System.out.println("0. Untuk kembali");
                        System.out.print("Masukkan angka: ");
                        inp = sc.nextInt();
                        switch (inp) {
                            case 1:
                                mawar.beriAir();
                                break;
                            case 2:
                                mawar.beriPupuk();
                                break;
                            case 3:
                                mawar.membiarkantanaman();
                                break;
                        }
                        System.out.println("");
                        
                        mawar.displayPlant();
                    } while (inp != 0);
                    break;
            }
        } while (pilTumbuhan != 0);
    }
}
