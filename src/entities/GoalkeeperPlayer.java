package entities;

public class GoalkeeperPlayer extends Player {
    protected Integer reflex;
    protected Float stature;

    public GoalkeeperPlayer(String name, Integer age, Integer skill, Integer reflex, Float stature) {
        super(name, age, skill);
        this.reflex = reflex;
        this.stature = stature;
    }

    @Override
    public Integer getSkill() {
        return ((skill * 5) + (((int)(stature * 100)) * 2) + (reflex * 3)) / 10;
    }

    public Integer getReflex() {
        return reflex;
    }

    public void setReflex(Integer reflex) {
        this.reflex = reflex;
    }

    public Float getStature() {
        return stature;
    }

    public void setStature(Float stature) {
        this.stature = stature;
    }
}
