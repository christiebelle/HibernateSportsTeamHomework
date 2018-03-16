package models;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private int id;
    private String name;
    private int founded;
    private String homestadium;
    private double salaryCap;
    private Manager manager;
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, int founded, String homestadium, double salaryCap) {
        this.name = name;
        this.founded = founded;
        this.homestadium = homestadium;
        this.salaryCap = salaryCap;
        this.manager = manager;
        this.players = new HashSet<Player>();
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

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public String getHomestadium() {
        return homestadium;
    }

    public void setHomestadium(String homestadium) {
        this.homestadium = homestadium;
    }

    public double getSalaryCap() {
        return salaryCap;
    }

    public void setSalaryCap(double salaryCap) {
        this.salaryCap = salaryCap;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
