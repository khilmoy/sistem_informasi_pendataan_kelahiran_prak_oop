/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB6;

/**
 * Class turunan dari Kelahiran
 * Digunakan untuk menambahkan detail
 * berat dan panjang bayi
 * 
 * Konsep:
 * - Inheritance
 * - Overriding
 * 
 * @author user
 */
public class KelahiranDetail extends Kelahiran {

    // atribut private
    private double beratBayi;
    private double panjangBayi;

    /**
     * Constructor default
     */
    public KelahiranDetail() {

    }

    /**
     * Constructor dengan parameter
     */
    public KelahiranDetail(String namaBayi, String namaAyah,
                           String namaIbu, String jenisKelamin,
                           String tanggalLahir, String alamat,
                           double beratBayi, double panjangBayi) {

        super(namaBayi, namaAyah, namaIbu,
              jenisKelamin, tanggalLahir, alamat);

        this.beratBayi = beratBayi;
        this.panjangBayi = panjangBayi;
    }

    // Getter dan Setter Berat Bayi
    public double getBeratBayi() {
        return beratBayi;
    }

    public void setBeratBayi(double beratBayi) {
        this.beratBayi = beratBayi;
    }

    // Getter dan Setter Panjang Bayi
    public double getPanjangBayi() {
        return panjangBayi;
    }

    public void setPanjangBayi(double panjangBayi) {
        this.panjangBayi = panjangBayi;
    }

    /**
     * Method overriding dari abstract method
     */
    @Override
    public String tampilData() {

        return "Nama Bayi      : " + getNamaBayi() +
               "\nBerat Bayi     : " + beratBayi + " Kg" +
               "\nPanjang Bayi   : " + panjangBayi + " Cm";
    }
}