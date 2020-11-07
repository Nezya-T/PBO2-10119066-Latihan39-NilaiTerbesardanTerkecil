/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBO210119066Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Penentu mahasiswa = new Penentu();
        Scanner scanner = new Scanner(System.in);
        int i, jumlahMahasiswa, nilaiTerbesar = 0, nilaiTerkecil;
        String petugas;
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ");
        petugas = mahasiswa.namaPetugas();
        jumlahMahasiswa = mahasiswa.getBanyak_mahasiswa();
        int[] nilai = new int[jumlahMahasiswa];
        for (i =0; i < jumlahMahasiswa; i++){
            System.out.printf("Nilai Mahasiswa ke-%d\t\t\t\t= ",i+1);
            nilai[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        nilaiTerbesar = mahasiswa.nilaiTerbesar(nilai);
        nilaiTerbesar = mahasiswa.nilaiTerkecil(nilai);
        System.out.println();
        System.out.println("Nilai Terbesar Adalah "+nilaiTerbesar);
        System.out.println("Nilai Terkecil Adalah "+nilaiTerkecil);
        System.out.println();
        System.out.print("Petugas : "+petugas);
    }
    
}
