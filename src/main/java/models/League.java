package models;



import javax.persistence.*;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="leagues")
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="league_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="season_start")
    public GregorianCalendar getSeasonstart() {
        return seasonstart;
    }

    public void setSeasonstart(GregorianCalendar seasonstart) {
        this.seasonstart = seasonstart;
    }

    @Column(name="season_end")
    public GregorianCalendar getSeasonend() {
        return seasonend;
    }

    public void setSeasonend(GregorianCalendar seasonend) {
        this.seasonend = seasonend;
    }

    @OneToMany(mappedBy = "league", fetch = FetchType.EAGER)
    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
