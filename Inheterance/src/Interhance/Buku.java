package Interhance;

public class Buku extends Collect {
    private String penulis;

    public Buku (String judul, String penulis, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.penulis = penulis;
    }

    public String getPenulis () {
        return this.penulis;
    }

    public void setPenulis (String writter) {
        this.penulis = writter;
    }
}
