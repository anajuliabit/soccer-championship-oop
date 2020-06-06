package entities;

public class DefenderPlayer extends Player {
    protected Integer coverage;
    protected Integer disarm;

    public DefenderPlayer(String name, Integer age, Integer skill, Integer coverage, Integer disarm) {
        super(name, age, skill);
       this.coverage = coverage;
       this.disarm = disarm;
    }

    @Override
    public Integer getSkill() {
        return ((skill * 5) + (coverage * 3) + (disarm * 2)) / 10;
    }

    public Integer getCoverage() {
        return coverage;
    }

    public void setCoverage(Integer coverage) {
        this.coverage = coverage;
    }

    public Integer getDisarm() {
        return disarm;
    }

    public void setDisarm(Integer disarm) {
        this.disarm = disarm;
    }
}