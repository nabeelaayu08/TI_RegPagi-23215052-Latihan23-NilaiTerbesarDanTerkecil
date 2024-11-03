package NilaiTerbesarTerkecil;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini menampilkan nilai terbesar dan terkecil dari nilai mahasiswa
 */

import java.util.Scanner;

public class NilaiTerbesarTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta nama petugas
        System.out.println("====== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ======");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        // Meminta input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        // Mencari nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        System.out.println(" ");
        // Menampilkan hasil
        System.out.println("====== Hasil Nilai Mahasiswa ======");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + ": " + nilaiMahasiswa[i]);
        }
        System.out.println(" ");
        System.out.println("Nilai Terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah: " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);
    }
}