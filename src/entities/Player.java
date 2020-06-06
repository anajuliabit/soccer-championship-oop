package entities;

public class Player {
    protected String name;
    protected Integer age;
    protected Integer skill;
    protected Integer number;
    protected Integer gols;

    public Player(String name, Integer age, Integer skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public void sumGol() {
        this.gols++;
    }

    public String printPlayer() {
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", skill: " + this.getSkill() + ", number" + this.getNumber() + ", gols: " + this.gols;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
