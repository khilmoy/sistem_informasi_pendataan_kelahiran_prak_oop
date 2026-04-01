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
 * Menambahkan informasi rumah sakit dan dokter
 */
public class KelahiranRS extends Kelahiran {

    String namaRS;
    String namaDokter;

    // Constructor
    public KelahiranRS(String namaBayi, String namaAyah, String namaIbu,
                       String jenisKelamin, String tanggalLahir, String alamat,
                       String namaRS, String namaDokter) {
        super(namaBayi, namaAyah, namaIbu, jenisKelamin, tanggalLahir, alamat);
        this.namaRS = namaRS;
        this.namaDokter = namaDokter;
    }

    // Method override
    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Rumah Sakit : " + namaRS);
        System.out.println("Dokter : " + namaDokter);
    }
}
