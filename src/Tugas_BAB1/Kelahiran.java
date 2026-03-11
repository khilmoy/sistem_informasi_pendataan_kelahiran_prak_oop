/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB1;

/**
 *
 * @author user
 */
// Class Kelahiran digunakan sebagai object class
// Class ini berfungsi untuk menyimpan data kelahiran bayi

// Class Kelahiran merupakan object class
// Class ini digunakan untuk menyimpan data kelahiran bayi
public class Kelahiran {
    
    // Atribut / variabel yang menyimpan informasi data kelahiran
    String namaBayi;      // Menyimpan nama bayi yang lahir
    String namaAyah;      // Menyimpan nama ayah dari bayi
    String namaIbu;       // Menyimpan nama ibu dari bayi
    String jenisKelamin;  // Menyimpan jenis kelamin bayi
    String tanggalLahir;  // Menyimpan tanggal lahir bayi
    String alamat;        // Menyimpan alamat tempat tinggal

    // Method tampilData() digunakan untuk menampilkan
    // seluruh data kelahiran ke layar/output console
    void tampilData() {
        
        // Menampilkan nama bayi
        System.out.println("Nama Bayi      : " + namaBayi);
        
        // Menampilkan nama ayah
        System.out.println("Nama Ayah      : " + namaAyah);
        
        // Menampilkan nama ibu
        System.out.println("Nama Ibu       : " + namaIbu);
        
        // Menampilkan jenis kelamin bayi
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        
        // Menampilkan tanggal lahir bayi
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        
        // Menampilkan alamat tempat tinggal
        System.out.println("Alamat         : " + alamat);
    }
}
