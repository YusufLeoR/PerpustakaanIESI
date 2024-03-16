package perpustakaan;

public class PeminjamanManager {

    public boolean save(BukuDipinjam[] bukuDipinjamCollection) {
        BukuDipinjam[] peminjaman = new BukuDipinjam[bukuDipinjamCollection.length];
        
        for (int i = 0; i < bukuDipinjamCollection.length; i++) {
            peminjaman[i] = bukuDipinjamCollection[i];
        }
        
        System.out.println("Buku yang berhasil dipinjam:");
        for (BukuDipinjam bukuDipinjam : peminjaman) {
            System.out.println("Judul: " + bukuDipinjam.getJudul() + ", Lama Pinjam: " + bukuDipinjam.getLamaPinjam());
        }
        //sementara
        return true;
    }
}
