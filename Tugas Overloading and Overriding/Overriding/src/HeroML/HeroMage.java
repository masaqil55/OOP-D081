package HeroML;

public class HeroMage {
    private String skill1, skill2, skill3;
    private String passive;

    public HeroMage (String passive, String skill1, String skill2, String skill3) {
        this.passive = passive;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
    }

    public void setPassive (String Passive) {
        this.passive = Passive;
    }

    public String getPassive () {
        return this.passive;
    }

    public void setSkill1 (String Skill) {
        this.skill1 = Skill;
    }

    public String getSkill1 () {
        return this.skill1;
    }

    public void setSkill2 (String skill2) {
        this.skill2 = skill2;
    }

    public String getSkill2 () {
        return this.skill2;
    }

    public void setSkill3 (String skill3) {
        this.skill3 = skill3;
    }

    public String getSkill3 () {
        return this.skill3;
    }
}
