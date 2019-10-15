/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung rata rata nilai mahasiswsa dengan konsep pbo
 */



public class PBO210118046Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        mahasiswa.setJmlMhs(scanner.nextInt());
        for (int i = 1;i<=mahasiswa.getJmlMhs();i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            mahasiswa.setNilai(scanner.nextInt(), i);
        }
        System.out.println("Maka, Rata rata nilainya adalah " + mahasiswa.getRataRata());
    }

}
