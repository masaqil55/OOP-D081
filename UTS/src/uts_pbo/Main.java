package uts_pbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah_penumpang = 5;
        int max_penumpang = 20;
        System.out.println("-----------------------------------------");
        System.out.println("OUTPUT : ");
        System.out.println("-----------------------------------------");
        System.out.println("Bus Berangkat dari Kantor -> Halte Porong");
        System.out.println("Jumlah Penumpang : " + jumlah_penumpang);
        System.out.println("3 Penumpang Turun di Halte Porong");
        System.out.println("2 Penumpang Turun di Halte Gresik");
        do {
            System.out.println("-----------------------------------------");
            haltePorong porong = new haltePorong(jumlah_penumpang, max_penumpang);
            System.out.println(porong.getWait() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Porong");
            System.out.print("Masukkan Penumpang yang Ingin Turun! ");

            int temp = input.nextInt();
            temp = porong.getPenumpang() - temp;

            System.out.println(temp + " Penumpang Turun");
            System.out.println(porong.getWait() + " Penumpang Naik");

            temp = temp + porong.getWait();

            System.out.println("Jumlah Penumpang " + temp);

            int penumpang = porong.getWait() - porong.getWait();
            System.out.println("Halte Porong " + penumpang + " Penumpang Menunggu");
            System.out.println(temp + " Menuju ke Halte Surabaya dan Halte Gresik");
            System.out.println("-----------------------------------------");

            halteSBY sby = new halteSBY(temp, max_penumpang);
            System.out.println(sby.getWait() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Surabaya");
            System.out.print("Masukkan Penumpang yang Ingin Turun! ");

            int tpp = input.nextInt();
            System.out.println(tpp + " Penumpang Turun");
            tpp = sby.getPenumpang() - tpp;

            System.out.println(sby.getWait() + " Penumpang Naik");

            tpp = tpp + sby.getWait();

            System.out.println("Jumlah Penumpang " + tpp);

            int pn2 = sby.getWait() - sby.getWait();

            System.out.println("Halte Surabaya " + pn2 + " Penumpang Menunggu");
            System.out.println(tpp + " Bus Menuju ke Halte Gresik");
            System.out.println("-----------------------------------------");

            halteGresik gresik = new halteGresik(tpp, max_penumpang);
            System.out.println(gresik.getWait() + " Penumpang Menunggu");
            System.out.println("Bus Sampai di Halte Gresik");
            System.out.print("Masukkan Penumpang yang Ingin Turun! ");
            
            int grs = input.nextInt();
            System.out.println(grs + " Penumpang Turun");
            grs = gresik.getPenumpang() - grs;

            System.out.println(gresik.getWait() + " Penumpang Naik");

            grs = grs + gresik.getWait();

            System.out.println("Jumlah Penumpang " + grs);

            int pn3 = gresik.getWait() - gresik.getWait();
            System.out.println("Halte Gresik " + pn3 + " Penumpang Menunggu");
            System.out.println(grs + " Bus Menuju ke Halte Porong");

            jumlah_penumpang = grs;
        } while (jumlah_penumpang <= 20);
        input.close();
    }
}
