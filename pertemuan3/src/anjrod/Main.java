/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anjrod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("=======Program Objek======");
        System.out.println("==========================");
        System.out.println("Silahkan Pilih Objek : ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Persegi");
        System.out.println("3. Lingkaran");
        System.out.println("4. Oval/Ellips");
        System.out.print("Pilih Objek : ");
        int choiceObject = input.nextInt();
        
        double CalculateArea = 0.0;
        double CalculatePrimeter = 0.0;
        switch (choiceObject) {
            case 1 :
                System.out.print("Masukkan Panjang : ");
                int panjang = input.nextInt();
                System.out.print ("Masukkan Lebar : ");
                int lebar = input.nextInt();
                Rectangle persegiPanjang = new Rectangle(panjang, lebar);
                CalculatePrimeter = persegiPanjang.HitungKeliling();
                CalculateArea = persegiPanjang.HitungLuas();
                break;
            case 2 :
                System.out.print("Masukkan Sisi : ");
                int sisi = input.nextInt();
                Square persegi = new Square(sisi);
                CalculatePrimeter = persegi.HitungKeliling();
                CalculateArea = persegi.HitungLuas();
                break;
            case 3 :
                System.out.print("Masukkan Jari-jari : ");
                int radius = input.nextInt();
                Circle Lingkaran = new Circle(radius);
                CalculatePrimeter = Lingkaran.HitungKeliling();
                CalculateArea = Lingkaran.HitungLuas();
                break;
            case 4 :
                System.out.print("Masukkan Panjang mayor : ");
                int major = input.nextInt();
                System.out.print("Masukkan Panjang minor : ");
                int minor = input.nextInt();
                Oval Ellips = new Oval(major, minor);
                CalculatePrimeter = Ellips.HitungKeliling();
                CalculateArea = Ellips.HitungLuas();
                break;
            default :
                System.out.println("Pilihan Tidak Tersedia....");
                break;
        }
        System.out.println("==========================");
        System.out.println("Hasilnya Adalah : ");
        System.out.println("Keliling = " + CalculatePrimeter);
        System.out.println("Luas = " + CalculateArea);
        System.out.println("==========================");
        
        input.close();
    }
    
}
