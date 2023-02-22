package com.PBO1;
import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("##  Selamat datang di Program Penghitung Gaji Pegawai   ##");

        //Input data pegawai
        System.out.print("Nama: ");
        String nama = keyboard.nextLine();
        System.out.print("Alamat: ");
        String alamat = keyboard.nextLine();
        System.out.print("Pengalaman (Pemula/Menengah/Expert): ");
        String pengalaman = keyboard.nextLine();
        System.out.print("Skill (Web/Mobile/Desktop): ");
        String skill = keyboard.nextLine();
        System.out.print("Departemen (IT/HRD/Finance): ");
        String departemen = keyboard.nextLine();

        //Hitung gaji berdasarkan data pegawai
        double gaji = 0;
        switch (departemen) {
            case "IT":
                gaji = 8000000;
                break;
            case "HRD":
                gaji = 5000000;
                break;
            case "Finance":
                gaji = 4000000;
                break;
            default:
                System.out.println("Departemen tidak valid!");
                System.exit(0);
        }

        switch (pengalaman) {
            case "Pemula":
                gaji += 500000;
                break;
            case "Menengah":
                gaji += 1000000;
                break;
            case "Expert":
                gaji += 2000000;
                break;
            default:
                System.out.println("Pengalaman tidak valid!");
                System.exit(0);
        }

        switch (skill) {
            case "Web":
                gaji += 1000000;
                break;
            case "Mobile":
                gaji += 2000000;
                break;
            case "Desktop":
                gaji += 2500000;
                break;
            default:
                System.out.println("Skill tidak valid!");
                System.exit(0);
        }

        System.out.println("Gaji " + nama + " Bertempat di " + alamat + " adalah: Rp. " + gaji);
    }
}