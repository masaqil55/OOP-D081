package HeroML;

public class Lunox extends HeroMage {
    private String skill4C, skill4P;

    public Lunox (String passive, String skill1, String skill2, String skill3, String skill4C, String skill4P) {
        super(passive, skill1, skill2, skill3);
        this.skill4C = skill4C;
        this.skill4P = skill4P;
    }

    public String getSkill4C () {
        return this.skill4C;
    }

    public void setSkill4C (String skill4) {
        this.skill4C = skill4;
    }

    public String getSkill4P () {
        return this.skill4P;
    }

    public void setSkill4P (String skill4) {
        this.skill4P = skill4;
    }

    public void nameOfSkill () {
        System.out.println("Many Name of Skill Lunox : ");
        System.out.print("Passive Lunox : ");
        System.out.print(this.getPassive());
        System.out.print("\n1 Skill Lunox : ");
        System.out.print(this.getSkill1());
        System.out.print("\n2 Skill Lunox");
        System.out.print(this.getSkill2());
        System.out.print("\n3 Skill Lunox");
        System.out.print(this.getSkill3());
        System.out.print("\nUltimate Lunox When Passive Turn Into Purple : ");
        System.out.print(this.getSkill4C());
        System.out.print("\nUltimate Lunox When Pasive Turn into Yellow : ");
        System.out.print(this.getSkill4P());
        System.out.println("\n");
    }
}
