package overloading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cho, num1, num2, num3, scal;
        System.out.println("Program Overloading AQIL");
        System.out.println("============================================");
        System.out.println("Beberapa Pilihan Menu : ");
        System.out.println("1. Perkalian Vektor Dengan Skalar");
        System.out.println("2. Perkalian Vektor Dengan Vektor");
        System.out.println("3. Keluar Program");
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        cho = input.nextInt();

        switch (cho) {
            case 1 :
                System.out.println("Anda Memilih Perhitungan Perkalian Vektor dengan Skalar");
                System.out.println("===========================================================");
                System.out.print("Masukkan Bilangan Vektor 1 : ");
                num1 = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 2 : ");
                num2 = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 3 : ");
                num3 = input.nextInt();
                VectorThree vector1 = new VectorThree(num1, num2, num3);
                System.out.print("Vektor Yang Sudah di Input : ");
                vector1.display();

                System.out.print("Masukkan Nilai Skalar : ");
                scal = input.nextInt();
                System.out.println("Berikut Hasil Perkalian Vektor dengan Skalar : ");
                System.out.print("Hasil : ");
                vector1.increase(scal).display();
                break;
            
            case 2 :
                System.out.println("Anda Memilih Perhitungan Perkalian Vektor dengan Vektor");
                System.out.println("===========================================================");
                System.out.print("Masukkan Bilangan Vektor 1 : ");
                num1 = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 2 : ");
                num2 = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 3 : ");
                num3 = input.nextInt();
                VectorThree vector2 = new VectorThree(num1, num2, num3);
                System.out.print("Vektor Yang Sudah di Input : ");
                vector2.display();

                System.out.println("Berikut Hasil Perkalian Vektor dengan Vektor : ");
                System.out.println("\nHasil : "+vector2.increase(vector2));
                break;
            case 3 :
                System.exit(0);
                break;
            
            default :
                System.out.println("Pilihan Anda Salah, Silahkan Coba Lagi!!!");
        }
        input.close();
    }
    
}
