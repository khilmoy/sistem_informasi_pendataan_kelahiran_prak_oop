/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB1;

/**
 *
 * @author user
 */
// Driver class digunakan untuk menjalankan program utama
// Class ini akan membuat object dari class Kelahiran
// dan mengisi data yang akan ditampilkan

public class MainKelahiran {

    // Method main merupakan titik awal program dijalankan
    public static void main(String[] args) {

        // Membuat object (objek) dari class Kelahiran
        // Object ini akan digunakan untuk menyimpan data kelahiran
        Kelahiran data = new Kelahiran();

        // Mengisi nilai pada setiap atribut yang ada di class Kelahiran
        data.namaBayi = "Andi";          // Mengisi nama bayi
        data.namaAyah = "Budi";          // Mengisi nama ayah
        data.namaIbu = "Siti";           // Mengisi nama ibu
        data.jenisKelamin = "Laki-laki"; // Mengisi jenis kelamin bayi
        data.tanggalLahir = "10 Maret 2026"; // Mengisi tanggal lahir bayi
        data.alamat = "Blitar";          // Mengisi alamat tempat tinggal

        // Memanggil method tampilData() dari object data
        // Method ini akan menampilkan semua data kelahiran ke layar
        data.tampilData();
    }
}
