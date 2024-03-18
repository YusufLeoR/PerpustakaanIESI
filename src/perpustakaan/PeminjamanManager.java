package perpustakaan;

import java.util.ArrayList;

public class PeminjamanManager {

    public boolean save(BukuDipinjam[] bukuDipinjamCollection) {
        ArrayList<BukuDipinjam> Peminjaman = new ArrayList<>();

        for (BukuDipinjam bukuDipinjam : bukuDipinjamCollection) {
            Peminjaman.add(bukuDipinjam);
        }
        
        return true;    
    }
}