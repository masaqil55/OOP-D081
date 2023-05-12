package HeroML;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cho;
        System.out.println("Program Overriding Hero Mobile Legends");
        System.out.println("====================================================\n");
        System.out.println("Silahkan Pilih Hero : ");
        System.out.println("1. Kadita");
        System.out.println("2. Yve");
        System.out.println("3. Lunox");
        System.out.print("Masukkan Pilihan Anda (0 Untuk Keluar) : ");
        cho = input.nextInt();
        switch (cho) {
            case 0 :
                System.exit(0);
                break;
            case 1 :
                System.out.println("Anda Memilih Kadita, Berikut Combo Skill nya : ");
                Kadita hero1 = new Kadita("Thalassophobia", "Ocean Oditty", "Breath of Ocean", "Rough Waves");
                hero1.comboSkill();
                break;
            case 2 :
                System.out.println("Anda Memilih Yve, Berikut Combo Skill nya : ");
                Yve hero2 = new Yve("Galactic Power", "Void Blast", "Void Crystal", "Void Crystal Activated", "Real Word Manipulation");
                hero2.comboSkill();
                break;
            case 3 :
                System.out.println("Anda Memilih Lunox, Berikut Combo Skill nya : ");
                Lunox hero3 = new Lunox("Dreamland Twist", "Starlight Pulse", "Chaos Assault", "Cosmic Fission", "Power of Chaos : Darkening", "Power of Order : Brilliance");
                hero3.comboSkill();
                break;
        }

        input.close();
    }
    
}
