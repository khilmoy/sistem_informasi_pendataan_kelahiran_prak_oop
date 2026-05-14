/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB6;

/**
 * Class turunan dari KelahiranDetail
 * Digunakan untuk menambahkan
 * informasi rumah sakit dan dokter
 * 
 * @author user
 */
public class KelahiranRS extends KelahiranDetail {

    // atribut private
    private String rumahSakit;
    private String dokter;

    /**
     * Constructor default
     */
    public KelahiranRS() {

    }

    /**
     * Constructor dengan parameter
     */
    public KelahiranRS(String namaBayi, String namaAyah,
                       String namaIbu, String jenisKelamin,
                       String tanggalLahir, String alamat,
                       double beratBayi, double panjangBayi,
                       String rumahSakit, String dokter) {

        super(namaBayi, namaAyah, namaIbu,
              jenisKelamin, tanggalLahir, alamat,
              beratBayi, panjangBayi);

        this.rumahSakit = rumahSakit;
        this.dokter = dokter;
    }

    // Getter dan Setter Rumah Sakit
    public String getRumahSakit() {
        return rumahSakit;
    }

    public void setRumahSakit(String rumahSakit) {
        this.rumahSakit = rumahSakit;
    }

    // Getter dan Setter Dokter
    public String getDokter() {
        return dokter;
    }

    public void setDokter(String dokter) {
        this.dokter = dokter;
    }

    /**
     * Method overriding
     */
    @Override
    public String tampilData() {

        return super.tampilData() +
               "\nRumah Sakit   : " + rumahSakit +
               "\nDokter         : " + dokter;
    }
}