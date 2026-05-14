/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Tugas_BAB6;

import Tugas_BAB5.*;
import javax.swing.table.DefaultTableModel;

public class GUI_Sistem_Data_Kelahiran extends javax.swing.JPanel {

    // Membuat object model table
    DefaultTableModel model;

     public GUI_Sistem_Data_Kelahiran() {
        initComponents();

        // Inisialisasi table model
        model = new DefaultTableModel();

        // Menghubungkan model ke JTable
        jTable1.setModel(model);

        // Menambahkan nama kolom tabel
        model.addColumn("No");
        model.addColumn("Nama Bayi");
        model.addColumn("Nama Ayah");
        model.addColumn("Nama Ibu");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Kelahiran");
        model.addColumn("Alamat");
        model.addColumn("Berat Bayi");
        model.addColumn("Panjang Bayi");
        model.addColumn("Rumah Sakit");
        model.addColumn("Dokter");
    }
        // METHOD BATAL
        public void batal(){
  
        txtNamaBayi.setText("");
        txtNamaAyah.setText("");
        txtNamaIbu.setText("");
        txtTanggal.setText("");
        txtAlamat.setText("");
        txtBerat.setText("");
        txtPanjang.setText("");
        txtRS.setText("");
        txtDokter.setText("");

        cmb_Kelamin.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNamaBayi = new javax.swing.JTextField();
        txtNamaAyah = new javax.swing.JTextField();
        txtNamaIbu = new javax.swing.JTextField();
        cmb_Kelamin = new javax.swing.JComboBox<>();
        txtTanggal = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        txtPanjang = new javax.swing.JTextField();
        txtRS = new javax.swing.JTextField();
        txtDokter = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btbHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        jLabel1.setText("SISTEM DATA KELAHIRAN");

        jLabel2.setText("Nama Bayi");

        jLabel3.setText("Nama Ayah");

        jLabel4.setText("Nama Ibu");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Tanggal Kelahiran");

        jLabel7.setText("Alamat");

        cmb_Kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        cmb_Kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_KelaminActionPerformed(evt);
            }
        });

        jLabel8.setText("Berat Bayi");

        jLabel9.setText("Panjang Bayi");

        jLabel10.setText("Rumah Sakit");

        jLabel11.setText("Dokter");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Bayi", "Nama Ayah", "Nama Ibu", "Jenis Kelamin", "Tanggal Kelahiran", "Alamat", "Berat Bayi", "Panjang Bayi", "Rumah Sakit", "Dokter"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btbHapus.setText("Hapus");
        btbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRS, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(txtDokter)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(43, 43, 43)
                            .addComponent(txtPanjang))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(58, 58, 58)
                            .addComponent(txtBerat))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNamaIbu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtNamaAyah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamaBayi, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(cmb_Kelamin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTanggal)
                                .addComponent(txtAlamat)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(655, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(590, 590, 590))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNamaBayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmb_Kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnBatal)
                    .addComponent(btnEdit)
                    .addComponent(btnClose)
                    .addComponent(btbHapus))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_KelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_KelaminActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmb_KelaminActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
    int baris = jTable1.getSelectedRow();

    // MEMBUAT OBJECT DARI CLASS TURUNAN
    KelahiranRS data = new KelahiranRS();

    // MENGISI DATA MENGGUNAKAN SETTER
    data.setNamaBayi(txtNamaBayi.getText());
    data.setNamaAyah(txtNamaAyah.getText());
    data.setNamaIbu(txtNamaIbu.getText());
    data.setJenisKelamin(cmb_Kelamin.getSelectedItem().toString());
    data.setTanggalLahir(txtTanggal.getText());
    data.setAlamat(txtAlamat.getText());

    // CONVERT STRING KE DOUBLE
    data.setBeratBayi(Double.parseDouble(txtBerat.getText()));
    data.setPanjangBayi(Double.parseDouble(txtPanjang.getText()));

    data.setRumahSakit(txtRS.getText());
    data.setDokter(txtDokter.getText());

    // JIKA SEDANG EDIT DATA
    if(baris != -1){

        jTable1.setValueAt(data.getNamaBayi(), baris, 1);
        jTable1.setValueAt(data.getNamaAyah(), baris, 2);
        jTable1.setValueAt(data.getNamaIbu(), baris, 3);
        jTable1.setValueAt(data.getJenisKelamin(), baris, 4);
        jTable1.setValueAt(data.getTanggalLahir(), baris, 5);
        jTable1.setValueAt(data.getAlamat(), baris, 6);

        // MENAMBAHKAN SATUAN
        jTable1.setValueAt(data.getBeratBayi() + " Kg", baris, 7);
        jTable1.setValueAt(data.getPanjangBayi() + " Cm", baris, 8);

        jTable1.setValueAt(data.getRumahSakit(), baris, 9);
        jTable1.setValueAt(data.getDokter(), baris, 10);

        // HILANGKAN SELECTION
        jTable1.clearSelection();

    } else {

        // TAMBAH DATA BARU
        int no = jTable1.getRowCount() + 1;

        model.addRow(new Object[]{
            no,
            data.getNamaBayi(),
            data.getNamaAyah(),
            data.getNamaIbu(),
            data.getJenisKelamin(),
            data.getTanggalLahir(),
            data.getAlamat(),

            // MENAMBAHKAN SATUAN
            data.getBeratBayi() + " Kg",
            data.getPanjangBayi() + " Cm",

            data.getRumahSakit(),
            data.getDokter()
        });
    }

    // FORM DIKOSONGKAN
    txtNamaBayi.setText("");
    txtNamaAyah.setText("");
    txtNamaIbu.setText("");
    txtTanggal.setText("");
    txtAlamat.setText("");
    txtBerat.setText("");
    txtPanjang.setText("");
    txtRS.setText("");
    txtDokter.setText("");

    cmb_Kelamin.setSelectedIndex(0);
                              
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
    int baris = jTable1.getSelectedRow();

    if(baris != -1){

        txtNamaBayi.setText(jTable1.getValueAt(baris, 1).toString());
        txtNamaAyah.setText(jTable1.getValueAt(baris, 2).toString());
        txtNamaIbu.setText(jTable1.getValueAt(baris, 3).toString());

        cmb_Kelamin.setSelectedItem(
            jTable1.getValueAt(baris, 4).toString()
        );

        txtTanggal.setText(jTable1.getValueAt(baris, 5).toString());
        txtAlamat.setText(jTable1.getValueAt(baris, 6).toString());

        // Menghapus tulisan Kg dan Cm saat edit
        txtBerat.setText(
            jTable1.getValueAt(baris, 7).toString().replace(" Kg", "")
        );

        txtPanjang.setText(
            jTable1.getValueAt(baris, 8).toString().replace(" Cm", "")
        );

        txtRS.setText(jTable1.getValueAt(baris, 9).toString());
        txtDokter.setText(jTable1.getValueAt(baris, 10).toString());

    } else {

        javax.swing.JOptionPane.showMessageDialog(
            null,
            "Pilih data yang ingin diedit!"
        );
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbHapusActionPerformed
        int baris = jTable1.getSelectedRow();

    if(baris != -1){
        model.removeRow(baris);
    }
    }//GEN-LAST:event_btbHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
    batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbHapus;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmb_Kelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtDokter;
    private javax.swing.JTextField txtNamaAyah;
    private javax.swing.JTextField txtNamaBayi;
    private javax.swing.JTextField txtNamaIbu;
    private javax.swing.JTextField txtPanjang;
    private javax.swing.JTextField txtRS;
    private javax.swing.JTextField txtTanggal;
    // End of variables declaration//GEN-END:variables
}
