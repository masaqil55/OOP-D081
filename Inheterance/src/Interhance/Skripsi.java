package Interhance;

public class Skripsi extends Buku {
    private String npm;

    public Skripsi (String judul, String npm, String Penerbit, int tahun) {
        super(judul, npm, Penerbit, tahun);
        this.npm = npm;
    }

    public String getNpm () {
        return this.npm;
    }

    public void setNpm (String NPM) {
        this.npm = NPM;
    }
}