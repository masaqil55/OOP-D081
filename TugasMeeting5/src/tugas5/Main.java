package tugas5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("=======Program Objek Bangun Ruang======");
        System.out.println("=======================================");
        System.out.println("Silahkan Pilih Objek : ");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Tabung");
        System.out.println("4. Bola");
        System.out.print("Pilih Objek Bangun Ruang : ");
        int cho = inputUser.nextInt();

        switch (cho) {
            case 1 :
                System.out.println("Anda Memilih Bangun Balok");
                System.out.print("Masukkan Panjang Sisi : ");
                int panjang_sisi = inputUser.nextInt();
                System.out.print("Masukkan Lebar Sisi : ");
                int lebar_sisi = inputUser.nextInt();
                System.out.print("Masukkan Tinggi Sisi : ");
                int tinggi_sisi = inputUser.nextInt();
                Beam Balok = new Beam(panjang_sisi, lebar_sisi, tinggi_sisi);
                System.out.println("Panjang Sisi Balok : " + Balok.getLength());
                System.out.println("Lebar Sisi Balok : " + Balok.getWidth());
                System.out.println("Tinggi Sisi Balok : " + Balok.getHeight());
                System.out.println("Volume Balok = "+ Balok.volumeResult());
                break;
            case 2 :
                System.out.println("Anda Memilih Bangun Kubus");
                System.out.print("Masukkan Panjang Sisi : ");
                int sisi_kubus = inputUser.nextInt();
                Kubus Cube = new Kubus(sisi_kubus);
                System.out.println("Panjang Sisi Kubus : " + Cube.getSide());
                System.out.println("Volume Kubus = "+ Cube.volumeResult());
                break;
            case 3 :
                System.out.println("Anda Memilih Bangun Tabung");
                System.out.print("Masukkan Jari-jari : ");
                int tabung_jari = inputUser.nextInt();
                System.out.print("Masukkan Tinggi Sisi : ");
                int tabung_tinggi = inputUser.nextInt();
                Tabung tab = new Tabung(tabung_jari, tabung_tinggi);
                System.out.println("Jari-jari Tabung : " + tab.getjariJari());
                System.out.println("Tinggi Tabung : " + tab.getTinggi());
                System.out.println("Volume Tabung = "+ tab.volumeResult());
                break;
            case 4 :
                System.out.println("Anda Memilih Bangun Bola");
                System.out.print("Masukkan Jari-jari : ");
                int jari_bola = inputUser.nextInt();
                Ball bola  = new Ball(jari_bola);
                System.out.println("Jari-jari Bola : " + bola.getjariJari());
                System.out.println("Volume Bola = "+ bola.volumeResult());
                break;
            default :
                System.out.println("System Cannot Find Your Choice, Please Try Again");
                break;
        }
        inputUser.close();
    }
}
