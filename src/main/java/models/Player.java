package models;

import enums.Availability;
import enums.Position;

import javax.persistence.*;
import java.util.GregorianCalendar;

@Entity
@Table(name="players")
public class Player {

    private int id;
    private String name;
    private Team team;
    private Position position;
    private int shirtnum;
    private double salary;
    private Availability available;
    private GregorianCalendar contractstart;
    private GregorianCalendar contractend;

    public Player() {
    }

    public Player(String name, Team team, Position position, int shirtnum, double salary, GregorianCalendar contractstart, GregorianCalendar contractend) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.shirtnum = shirtnum;
        this.salary = salary;
        this.available = available;
        this.contractstart = contractstart;
        this.contractend = contractend;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name="team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Column(name="position")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Column(name="shirt_number")
    public int getShirtnum() {
        return shirtnum;
    }

    public void setShirtnum(int shirtnum) {
        this.shirtnum = shirtnum;
    }

    @Column(name="salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Column(name="availablity")
    public Availability getAvailable() {
        return available;
    }

    public void setAvailable(Availability available) {
        this.available = available;
    }

    @Column(name="contract_start_date")
    public GregorianCalendar getContractstart() {
        return contractstart;
    }

    public void setContractstart(GregorianCalendar contractstart) {
        this.contractstart = contractstart;
    }

    @Column(name="contract_end_date")
    public GregorianCalendar getContractend() {
        return contractend;
    }

    public void setContractend(GregorianCalendar contractend) {
        this.contractend = contractend;
    }
}
