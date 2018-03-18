package models;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name="managers")
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

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne
    @Column(name="team")
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Column(name="hired_date")
    public GregorianCalendar getHired() {
        return hired;
    }

    public void setHired(GregorianCalendar hired) {
        this.hired = hired;
    }

    @Column(name="")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
