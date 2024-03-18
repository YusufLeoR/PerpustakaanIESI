/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thisi
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }
    
    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inpPeminjaman = new javax.swing.JTextField();
        btCari = new javax.swing.JButton();
        btPinjam = new javax.swing.JButton();
        btBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePencarian = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePeminjaman = new javax.swing.JTable();
        btKonfirmasi = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inpPeminjaman.setToolTipText("Lama Peminjaman");

        btCari.setText("Cari");
        btCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCariActionPerformed(evt);
            }
        });

        btPinjam.setText("Pinjam");
        btPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPinjamActionPerformed(evt);
            }
        });

        btBatal.setText("Batal");
        btBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatalActionPerformed(evt);
            }
        });

        tablePencarian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablePencarian);

        tablePeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul",
                "Durasi Peminjaman"
            }
        ));
        jScrollPane2.setViewportView(tablePeminjaman);

        btKonfirmasi.setText("Konfirmasi");
        btKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKonfirmasiActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("Lama Peminjaman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inpPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(btBatal, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btCari, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(btKonfirmasi)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inpPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCari)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btPinjam)
                        .addGap(18, 18, 18)
                        .addComponent(btBatal)))
                .addGap(32, 32, 32)
                .addComponent(btKonfirmasi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatalActionPerformed
        // TODO add your handling code here:
        int bukuDipilih = tablePeminjaman.getSelectedRow();
        if (bukuDipilih == -1) {
            DialogUI dialogUI = new DialogUI("Pilih buku yang ingin dihapus");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        } else {
            hapusBuku(bukuDipilih);
        }
    }//GEN-LAST:event_btBatalActionPerformed

    private void btPinjamActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int bukuPinjam = tablePencarian.getSelectedRow();
        String durasiString = jTextField1.getText();
        int durasiInt = 0;
        
        if (durasiString.isEmpty()) {
        DialogUI dialogUI = new DialogUI("Silahkan masukkan durasi pinjaman");
        dialogUI.pack();
        dialogUI.setLocationRelativeTo(null);
        dialogUI.setVisible(true);
        return;
    }

        if (!durasiString.matches("[0-9]+")) { 
            DialogUI dialogUI = new DialogUI("Durasi harus berupa angka");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }

        durasiInt = Integer.parseInt(durasiString);

        if (durasiInt > 3 || durasiInt < 1) {
            DialogUI dialogUI = new DialogUI("Lama peminjaman maksimal 3 hari dan minimal 1 hari");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }

        if (bukuPinjam == -1) {
            DialogUI dialogUI = new DialogUI("Silahkan pilih buku yang ingin dipinjam.");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }
        
            tambahBuku(bukuPinjam, durasiInt);
        
    }
    private void btKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKonfirmasiActionPerformed
        // TODO add your handling code here:
        int jumlahBukuDipinjam = tablePeminjaman.getRowCount();

        if (jumlahBukuDipinjam > 10) {
            DialogUI dialogUI = new DialogUI("Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
            return;
        }
        
        BukuDipinjam[] bukuDipinjams = new BukuDipinjam[jumlahBukuDipinjam];
        for (int i = 0; i < jumlahBukuDipinjam; i++) {
            String judul = tablePeminjaman.getValueAt(i, 0).toString();
            int durasi = Integer.parseInt(tablePeminjaman.getValueAt(i, 1).toString());
            bukuDipinjams[i] = new BukuDipinjam(judul, durasi);
        }

        Perpustakaan.controllerPeminjaman.pinjam(bukuDipinjams);
    }//GEN-LAST:event_btKonfirmasiActionPerformed

    private void btCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCariActionPerformed
        // TODO add your handling code here:
        String judulBuku = inpPeminjaman.getText();
        Perpustakaan.controllerPeminjaman.cariBuku(judulBuku);
    }//GEN-LAST:event_btCariActionPerformed

    public void display(ArrayList<Buku> bukuList) {
        Object[] kolom = { "Judul" };
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }    
        tablePencarian.setModel(model);
    }
    
    public void tambahBuku(int judul, int durasiPinjam) {
        Object[] baris = { tablePencarian.getValueAt(judul, 0), durasiPinjam };
        tampilPinjam(baris);
    }
    
    public void tampilPinjam(Object[] baris){
        DefaultTableModel model = (DefaultTableModel) tablePeminjaman.getModel();
        model.addRow(baris);
    }

    public void hapusBuku(int bukuDipilih) {
        DefaultTableModel model = (DefaultTableModel) tablePeminjaman.getModel();
        model.removeRow(bukuDipilih);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBatal;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btKonfirmasi;
    private javax.swing.JButton btPinjam;
    private javax.swing.JTextField inpPeminjaman;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablePeminjaman;
    private javax.swing.JTable tablePencarian;
    // End of variables declaration//GEN-END:variables

}
