package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="teams")
public class Team {

    private int id;
    private String name;
    private League league;
    private int founded;
    private String homestadium;
    private double salaryCap;
    private Manager manager;
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, League league, int founded, String homestadium, double salaryCap) {
        this.name = name;
        this.league = league;
        this.founded = founded;
        this.homestadium = homestadium;
        this.salaryCap = salaryCap;
        this.manager = manager;
        this.players = new HashSet<Player>();
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
    @JoinColumn(name="league_id", nullable = false)
    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @Column(name="founded")
    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    @Column(name="home_stadium")
    public String getHomestadium() {
        return homestadium;
    }

    public void setHomestadium(String homestadium) {
        this.homestadium = homestadium;
    }

    @Column(name="salary_cap")
    public double getSalaryCap() {
        return salaryCap;
    }

    public void setSalaryCap(double salaryCap) {
        this.salaryCap = salaryCap;
    }

    @OneToOne
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
