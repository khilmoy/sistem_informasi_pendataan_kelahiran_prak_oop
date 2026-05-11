/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_BAB4;

/**
 * Class turunan dari Kelahiran
 * Digunakan untuk menambahkan informasi
 * rumah sakit dan dokter kelahiran
 * 
 * @author user
 */
public class KelahiranRS extends Kelahiran {

    // atribut private
    private String namaRS;
    private String namaDokter;

    /**
     * Constructor untuk menginisialisasi data
     */
    public KelahiranRS(String namaBayi, String namaAyah, String namaIbu,
                       String jenisKelamin, String tanggalLahir, String alamat,
                       String namaRS, String namaDokter) {

        super(namaBayi, namaAyah, namaIbu,
              jenisKelamin, tanggalLahir, alamat);

        this.namaRS = namaRS;
        this.namaDokter = namaDokter;
    }

    // Getter dan Setter Nama Rumah Sakit
    public String getNamaRS() {
        return namaRS;
    }

    public void setNamaRS(String namaRS) {
        this.namaRS = namaRS;
    }

    // Getter dan Setter Nama Dokter
    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    /**
     * Method override untuk menampilkan
     * data rumah sakit dan dokter
     */
    @Override
    public void tampilData() {

        super.tampilData();

        System.out.println("Rumah Sakit : " + namaRS);
        System.out.println("Dokter      : " + namaDokter);
    }
}
