import db.DBHelper;
import models.League;
import models.Manager;
import models.Team;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.GregorianCalendar;

import static junit.framework.Assert.assertEquals;

public class TestLeague {

    League league;
    Team team;

    @After
    public void tearDown() throws Exception {
        DBHelper.delete(league);
        DBHelper.delete(team);
    }

    @Before
    public void setUp() throws Exception {
        GregorianCalendar seasonstart = new GregorianCalendar(2017,10,4);
        GregorianCalendar seasonend = new GregorianCalendar(2018,4,7);
        league = new League("NHL", seasonstart, seasonend);
        DBHelper.save(league);

        team = new Team("Philadelphia Flyers", league, 1967, "Wells Fargo Center", 75000000);
        DBHelper.save(team);
    }

    @Test
    public void testLeagueName() {
        assertEquals("NHL", league.getName());
    }

    @Test
    public void testLeagueHasTeams() {
        assertEquals(1, league.getTeams().size());
    }
}
