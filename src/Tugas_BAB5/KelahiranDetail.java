/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB5;

/**
 * Class turunan dari Kelahiran
 * Digunakan untuk menambahkan detail
 * berat dan panjang bayi
 * 
 * Konsep yang digunakan:
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
     * (OVERLOADING 1)
     */
    public KelahiranDetail() {

    }

    /**
     * Constructor dengan parameter
     * (OVERLOADING 2)
     */
    public KelahiranDetail(String namaBayi, String namaAyah, String namaIbu,
                           String jenisKelamin, String tanggalLahir, String alamat,
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
     * Method overriding untuk menampilkan
     * data detail kelahiran
     */
    @Override
    public String tampilData() {

        return super.tampilData() +
               "\nBerat Bayi    : " + beratBayi + " kg" +
               "\nPanjang Bayi  : " + panjangBayi + " cm";
    }
}