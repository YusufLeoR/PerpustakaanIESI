package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormPeminjaman extends javax.swing.JFrame {

    private ArrayList<BukuDipinjam> bukuDipinjamCollection;

    public FormPeminjaman() {
        initComponents();
        bukuDipinjamCollection = new ArrayList<>();
    }
    
    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void initComponents() {

        judulBukuField = new javax.swing.JTextField();
        lamaPeminjamanField = new javax.swing.JTextField();
        pinjamButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pinjamButton.setText("Pinjam");
        pinjamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulBukuField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pinjamButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lamaPeminjamanField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(judulBukuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lamaPeminjamanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pinjamButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pinjamButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String judulBuku = judulBukuField.getText();
        int lamaPeminjaman = Integer.parseInt(lamaPeminjamanField.getText());
        
        // Memanggil metode tambahBuku
        tambahBuku(new BukuDipinjam(judulBuku, lamaPeminjaman));
        
        // Menampilkan pesan konfirmasi
        JOptionPane.showMessageDialog(this, "Buku berhasil dipinjam!");
        
        // Menutup form setelah selesai
        this.dispose();
    }

    private void tambahBuku(BukuDipinjam bukuDipinjam) {
        bukuDipinjamCollection.add(bukuDipinjam);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField judulBukuField;
    private javax.swing.JTextField lamaPeminjamanField;
    private javax.swing.JButton pinjamButton;
    // End of variables declaration//GEN-END:variables
}
