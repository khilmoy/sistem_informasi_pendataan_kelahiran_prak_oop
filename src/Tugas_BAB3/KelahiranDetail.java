/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB3;

/**
 *
 * @author user
 */
/**
 * Class turunan dari Kelahiran
 * Menambahkan informasi berat dan panjang bayi
 */
public class KelahiranDetail extends Kelahiran {

    double beratBayi;
    double panjangBayi;

    // Constructor
    public KelahiranDetail(String namaBayi, String namaAyah, String namaIbu,
                           String jenisKelamin, String tanggalLahir, String alamat,
                           double beratBayi, double panjangBayi) {
        super(namaBayi, namaAyah, namaIbu, jenisKelamin, tanggalLahir, alamat);
        this.beratBayi = beratBayi;
        this.panjangBayi = panjangBayi;
    }

    // Method override
    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Berat Bayi : " + beratBayi + " kg");
        System.out.println("Panjang Bayi : " + panjangBayi + " cm");
    }
}
