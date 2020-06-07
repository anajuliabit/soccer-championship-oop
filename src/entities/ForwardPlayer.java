package entities;

public class ForwardPlayer extends Player {
    protected Integer speed;
    protected Integer technique;

    public ForwardPlayer(String name, Integer age, Integer skill, Integer speed, Integer technique) {
        super(name, age, skill);
        this.speed = speed;
        this.technique = technique;
    }

    @Override
    public Integer getSkill() {
        return ((skill * 5) + (speed * 2) + (technique * 3)) / 10;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getTechnique() {
        return technique;
    }

    public void setTechnique(Integer technique) {
        this.technique = technique;
    }
}
