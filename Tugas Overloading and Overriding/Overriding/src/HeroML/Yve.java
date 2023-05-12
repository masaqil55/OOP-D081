package HeroML;

public class Yve extends HeroMage {
    private String skill2Extend;
    public Yve (String passive, String skill1, String skill2, String skill2Extend, String skill3) {
        super(passive, skill1, skill2, skill3);
        this.skill2Extend = skill2Extend;
    }

    public String getSkill2Ex () {
        return this.skill2Extend;
    }

    public void setSkill2Ex (String skill2Extends) {
        this.skill2Extend = skill2Extends;
    }

    public void comboSkill () {
        System.out.print(this.getSkill1() + " -> ");
        System.out.print(this.getSkill2() + " Extends With Tap Skill 2 More : ");
        System.out.print(this.getSkill2Ex() + " \nSkill 2 Extends Deal DPS and Slow the Enemies ");
        System.out.print(" -> Check Passive, if Will be 10 Stack "+this.getPassive());
        System.out.print(" -> Use Ultimate : "+this.getSkill3()+"\n");
    }
}
