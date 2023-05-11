package Interhance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Buka Buku an Versi AQIL");
        System.out.println("=============================================\n");
        System.out.println("Koleksi-Koleksi Saya :");
        Collect koleksi = new Collect("Raikantopeni", "Erlangga", 2002);
        System.out.println("Judul : "+koleksi.getJudul());
        System.out.println("Penerbit : "+koleksi.getPenerbit());
        System.out.println("Keluaran : "+koleksi.getTahun());
        System.out.println("");
        System.out.println("=============================================\n");
        System.out.println("Koleksi Majalah Saya : ");
        Majala majalah = new Majala("Skincare Magazine", "Ekslusif for Boti", "Remix Cupcake", 2023);
        System.out.println("Judul : "+majalah.getJudul());
        System.out.println("Edisi : "+majalah.getEdisi());
        System.out.println("Penerbit : "+majalah.getPenerbit());
        System.out.println("Keluaran Tahun : "+majalah.getTahun());
        System.out.println("");
        System.out.println("=============================================\n");
        System.out.println("Koleksi Buku-Buku Saya : ");
        Buku book = new Buku("Moby Dick Bookr", "Herman Melville", "Penguin Classic", 2022);
        System.out.println("Judul : "+book.getJudul());
        System.out.println("Penulis : "+book.getPenulis());
        System.out.println("Penerbit : "+book.getPenerbit());
        System.out.println("Keluaran Tahun : "+book.getTahun());
        System.out.println("");
        System.out.println("---------------------------------------------\n");
        System.out.println("Berikut Tampilan Skripsi : ");
        Skripsi scription = new Skripsi("Greenify, Aplikasi Pelopor Manajemen Baterai Li-ion Smartphone", "21081010163", "Jurnal Kesatria", 2021);
        System.out.println("Judul SKripsi : "+scription.getJudul());
        System.out.println("NPM : "+scription.getNpm());
        System.out.println("Penerbit : "+scription.getPenerbit());
        System.out.println("Tahun Keluaran : "+scription.getTahun());
    }
}