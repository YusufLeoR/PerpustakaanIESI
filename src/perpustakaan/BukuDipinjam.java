package perpustakaan;

public class BukuDipinjam {
    private String judul;
    private int lamaPinjam;

    public BukuDipinjam(String judul, int lamaPinjam) {
        this.judul = judul;
        this.lamaPinjam = lamaPinjam;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }
}
