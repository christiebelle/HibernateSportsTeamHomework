package models;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

public class League {

    private int id;
    private String name;
    private GregorianCalendar seasonstart;
    private GregorianCalendar seasonend;
    private Set<Team> teams;

    public League() {
    }

    public League(String name, GregorianCalendar seasonstart, GregorianCalendar seasonend) {
        this.name = name;
        this.seasonstart = seasonstart;
        this.seasonend = seasonend;
        this.teams = new HashSet<Team>();
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

    public GregorianCalendar getSeasonstart() {
        return seasonstart;
    }

    public void setSeasonstart(GregorianCalendar seasonstart) {
        this.seasonstart = seasonstart;
    }

    public GregorianCalendar getSeasonend() {
        return seasonend;
    }

    public void setSeasonend(GregorianCalendar seasonend) {
        this.seasonend = seasonend;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
