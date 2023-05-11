package Interhance;

public class Collect {
    private String penerbit, judul;
    private int tahun;

    public Collect (String judul, String Penerbit, int tahun) {
        this.judul = judul;
        this.penerbit = Penerbit;
        this.tahun = tahun;
    }

    public void setJudul (String Judul) {
        this.judul = Judul;
    }

    public String getJudul () {
        return this.judul;
    }

    public void setPenerbit (String Penerbit) {
        this.penerbit = Penerbit;
    }

    public String getPenerbit () {
        return this.penerbit;
    }

    public void setTahun (int tahun) {
        this.tahun = tahun;
    }

    public int getTahun () {
        return this.tahun;
    }
}
