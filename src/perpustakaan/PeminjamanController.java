package perpustakaan;

import java.util.ArrayList;

public class PeminjamanController {
    
    public void showFormPeminjaman() {
        FormPeminjaman formPeminjaman = new FormPeminjaman();
        formPeminjaman.show(); 
    }
    
    public void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
            if(listBuku.isEmpty())
            {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } 
            else {
                Perpustakaan.formPencarian.display(listBuku);
            }
        } catch(Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
    
    public void pinjam(BukuDipinjam[] bukuDipinjams) {
        PeminjamanManager peminjamanManager = new PeminjamanManager();
        boolean success = peminjamanManager.save(bukuDipinjams);
        if (success) {
            DialogUI dialogUI = new DialogUI("Peminjaman berhasil disimpan");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        } else {
            DialogUI dialogUI = new DialogUI("Peminjaman gagal disimpan");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
}
