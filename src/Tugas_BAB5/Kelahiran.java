/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB5;

/**
 * Class Kelahiran digunakan untuk menyimpan
 * data informasi kelahiran bayi
 * 
 * Konsep yang digunakan:
 * - Enkapsulasi
 * - Overloading
 * 
 * @author user
 */
public class Kelahiran {

    // Atribut private (enkapsulasi)
    private String namaBayi;
    private String namaAyah;
    private String namaIbu;
    private String jenisKelamin;
    private String tanggalLahir;
    private String alamat;

    /**
     * Constructor default
     * (OVERLOADING 1)
     */
    public Kelahiran() {

    }

    /**
     * Constructor dengan parameter
     * (OVERLOADING 2)
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

    // Getter dan Setter Nama Bayi
    public String getNamaBayi() {
        return namaBayi;
    }

    public void setNamaBayi(String namaBayi) {
        this.namaBayi = namaBayi;
    }

    // Getter dan Setter Nama Ayah
    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    // Getter dan Setter Nama Ibu
    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    // Getter dan Setter Jenis Kelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter dan Setter Tanggal Lahir
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    // Getter dan Setter Alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * Method untuk menampilkan data kelahiran
     */
    public String tampilData() {
        return "Nama Bayi      : " + namaBayi +
               "\nNama Ayah      : " + namaAyah +
               "\nNama Ibu       : " + namaIbu +
               "\nJenis Kelamin  : " + jenisKelamin +
               "\nTanggal Lahir  : " + tanggalLahir +
               "\nAlamat         : " + alamat;
    }
}