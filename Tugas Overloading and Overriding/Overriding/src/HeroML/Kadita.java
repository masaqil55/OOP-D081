package HeroML;

public class Kadita extends HeroMage {
    public Kadita (String passive, String skill1, String skill2, String skill3) {
        super(passive, skill1, skill2, skill3);
    }

    public void comboSkill () {
        System.out.print(this.getSkill1()+" -> ");
        System.out.print(this.getSkill2()+" -> ");
        System.out.print(this.getSkill3()+" \nFinally Combo Finished, an Enemy Has Bein Slain\n");
        System.out.println(this.getPassive()+" Kadita Heals 65% From The Total Percentage of Lost HP");
    }
}
