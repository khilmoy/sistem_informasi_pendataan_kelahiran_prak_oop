/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB2;

/**
 * Driver class digunakan untuk menjalankan program utama
 */
public class MainKelahiran {

    public static void main(String[] args) {

        /**
         * Membuat object dengan constructor
         * Data langsung diisi saat object dibuat
         */
        Kelahiran data = new Kelahiran(
            "Andi",
            "Budi",
            "Siti",
            "Laki-laki",
            "10 Maret 2026",
            "Blitar"
        );

        // Menampilkan data
        data.tampilData();
    }
}