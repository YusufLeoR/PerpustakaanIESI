package perpustakaan;

import java.io.FileWriter;
import java.io.IOException;

public class PeminjamanManager {
    
    public boolean save(BukuDipinjam[] buku) {
        try (FileWriter writer = new FileWriter("peminjaman.txt")) {
            for (BukuDipinjam bukuDipinjam : buku) {
                writer.write(bukuDipinjam.judul + "," + bukuDipinjam.lama + "\n");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    } 
}
