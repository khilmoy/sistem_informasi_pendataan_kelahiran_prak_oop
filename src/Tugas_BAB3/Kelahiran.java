/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB3;

/**
 *
 * @author user
 */
public class Kelahiran {
    
    // Atribut / variabel yang menyimpan informasi data kelahiran
    String namaBayi;      
    String namaAyah;      
    String namaIbu;       
    String jenisKelamin;  
    String tanggalLahir;  
    String alamat;        

    /**
     * Constructor digunakan untuk menginisialisasi
     * semua data saat object dibuat
     */
    public Kelahiran(String namaBayi, String namaAyah, String namaIbu,
                     String jenisKelamin, String tanggalLahir, String alamat) {
        
        this.namaBayi = namaBayi;
        this.namaAyah = namaAyah;
        this.namaIbu = namaIbu;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    /**
     * Method tampilData() digunakan untuk menampilkan
     * seluruh data kelahiran ke layar/output console
     */
    void tampilData() {
        System.out.println("Nama Bayi      : " + namaBayi);
        System.out.println("Nama Ayah      : " + namaAyah);
        System.out.println("Nama Ibu       : " + namaIbu);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Alamat         : " + alamat);
    }
}
