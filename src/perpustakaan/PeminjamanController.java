package perpustakaan;

import java.util.ArrayList;

public class PeminjamanController {
    
    private FormPeminjaman formPeminjaman;
    private ArrayList<BukuDipinjam> bukuDipinjamCollection;
    
    public PeminjamanController() {
        bukuDipinjamCollection = new ArrayList<>();
    }
    
    public void showFormPeminjaman() {
        formPeminjaman = new FormPeminjaman();
        formPeminjaman.tampilkan();
    }
    
    public void pinjam(Buku buku, int lama) {
        BukuDipinjam bukuDipinjam = new BukuDipinjam();
        bukuDipinjam.judul = buku.judul;
        bukuDipinjam.lama = lama;
        bukuDipinjamCollection.add(bukuDipinjam);
        
        // Menampilkan pesan konfirmasi
        DialogUI dialogUI = new DialogUI("Buku berhasil dipinjam!");
        dialogUI.pack();
        dialogUI.setLocationRelativeTo(null);
        dialogUI.setVisible(true);
    }
    
    public void tampilPinjaman(Buku[] buku) {
        StringBuilder message = new StringBuilder("Buku yang sedang dipinjam:\n");
        for (BukuDipinjam bukuDipinjam : bukuDipinjamCollection) {
            message.append("- ").append(bukuDipinjam.judul).append(" (Lama: ").append(bukuDipinjam.lama).append(" hari)\n");
        }
        
        // Menampilkan informasi peminjaman
        DialogUI dialogUI = new DialogUI(message.toString());
        dialogUI.pack();
        dialogUI.setLocationRelativeTo(null);
        dialogUI.setVisible(true);
    }
    
    public void hapusBuku(BukuDipinjam bukuDipinjam) {
        bukuDipinjamCollection.remove(bukuDipinjam);
        
        // Menampilkan pesan konfirmasi
        DialogUI dialogUI = new DialogUI("Buku berhasil dihapus dari peminjaman!");
        dialogUI.pack();
        dialogUI.setLocationRelativeTo(null);
        dialogUI.setVisible(true);
    }
}
