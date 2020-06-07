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
        this.gols = 0;
    }

    public void sumGol() {
        this.gols++;
    }

    public String printPlayer() {
        return "Nome: " + this.getName() + ", Idade: " + this.getAge() + ", Habilidade: " + this.getSkill();
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
