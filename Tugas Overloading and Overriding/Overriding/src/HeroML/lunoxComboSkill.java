package HeroML;

public class lunoxComboSkill extends Lunox {
    public lunoxComboSkill (String passive, String skill1, String skill2, String skill3, String skill4C, String skill4P) {
        super(passive, skill1, skill2, skill3, skill4C, skill4P);
    }

    public void comboSkill () {
        System.out.print(this.getSkill2()+" -> ");
        System.out.print("Passive Activated "+this.getPassive());
        System.out.print(" -> "+this.getSkill4C()+" \nYou Will Convert 80% CD to Magic Penetration");
        System.out.print(" -> "+this.getSkill3());
        System.out.print(" -> "+getSkill2() + " Spam This Skill");
        System.out.println("\nIf Enemy Come on You, Use This "+this.getSkill1() + " Spam 2x This Skill");
        System.out.print(" -> "+ this.getSkill4P());
        System.out.print(" \nFunction : You Will Immune Of All Damage and CC");
        System.out.print(" \nand You Will Convert 120% CD to Physical and Magic Defense\n");
    }
}
