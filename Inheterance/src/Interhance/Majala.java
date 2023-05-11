package Interhance;

public class Majala extends Collect {
    private String edisi;

    public Majala (String judul, String edisi, String Penerbit, int tahun) {
        super(judul, Penerbit, tahun);
        this.edisi = edisi;
    }

    public String getEdisi () {
        return this.edisi;
    }

    public void setEdisi (String Edisi) {
        this.edisi = Edisi;
    }
}