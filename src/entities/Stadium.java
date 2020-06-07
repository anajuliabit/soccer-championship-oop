package entities;

public class Stadium {

    private String name;
    private String locale;
    private Integer peopleCapacity;
    private Team team;

    public Stadium(String name, String locale, Integer peopleCapacity, Team team) {
        this.name = name;
        this.locale = locale;
        this.peopleCapacity = peopleCapacity;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(Integer peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
