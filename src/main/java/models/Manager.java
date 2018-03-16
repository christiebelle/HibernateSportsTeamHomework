package models;

import java.util.GregorianCalendar;

public class Manager {

    private int id;
    private String name;
    private Team team;
    private GregorianCalendar hired;
    private int salary;

    public Manager() {
    }

    public Manager(String name, Team team, GregorianCalendar hired, int salary) {
        this.name = name;
        this.team = team;
        this.hired = hired;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public GregorianCalendar getHired() {
        return hired;
    }

    public void setHired(GregorianCalendar hired) {
        this.hired = hired;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
