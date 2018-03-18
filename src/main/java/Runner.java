import db.DBHelper;
import enums.Position;
import models.League;
import models.Manager;
import models.Player;
import models.Team;

import java.util.GregorianCalendar;

public class Runner {

    public static void main(String[] args) {

        League league = new League("NHL", GregorianCalendar seasonstart = new GregorianCalendar(2017,10,4), GregorianCalendar seasonend = new GregorianCalendar(2018,4,7);
        DBHelper.save(league);

        Team team1 = new Team("Philadelphia Flyers", league, 1967, "Wells Fargo Center", 75000000);
        DBHelper.save(team1);

        Team team2 = new Team("Nashville Predators", league, 1997, "Bridgestone Arena", 75000000);
        DBHelper.save(team2);

        Team team3 = new Team("Toronto Maple Leafs", league, 1917, "Air Canada Center", 75000000);
        DBHelper.save(team3);

        Manager manager1 = new Manager("Dave Hakstol", team1, GregorianCalendar hired = new GregorianCalendar(2015,5,1), 2000000);
        DBHelper.save(manager1);

        Manager manager2 = new Manager("Peter Laviolette", team2, GregorianCalendar hired = new GregorianCalendar(2014,5,1), 2000000);
        DBHelper.save(manager1);

        Manager manager3 = new Manager("Mike Babcock", team3, GregorianCalendar hired = new GregorianCalendar(2015,5,20), 6250000);
        DBHelper.save(manager1);

        Player player1 = new Player("Claude Giroux", team1, Position.CENTRE, 28, 9000000, GregorianCalendar contractstart = new GregorianCalendar(2014,5,1), GregorianCalendar contractend = new GregorianCalendar(2022,4,30));
        DBHelper.save(player1);

        Player player2 = new Player("Mike Fisher", team2, Position.CENTRE, 12, 1000000, GregorianCalendar contractstart = new GregorianCalendar(2018,1,31), GregorianCalendar contractend = new GregorianCalendar(2018,4,30));
        DBHelper.save(player2);

        Player player3 = new Player("Auston Matthews", team3, Position.CENTRE, 34, 9250000, GregorianCalendar contractstart = new GregorianCalendar(2016,7,21), GregorianCalendar contractend = new GregorianCalendar(2019,4,30));
        DBHelper.save(player3);

        Player player4 = new Player("Michael Raffl", team1, Position.RIGHTWING, 12, 2350000, GregorianCalendar contractstart = new GregorianCalendar(2016,2,28), GregorianCalendar contractend = new GregorianCalendar(2019,4,30));
        DBHelper.save(player4);

        Player player5 = new Player("Pekka Rinne", team2, Position.GOALIE, 35, 7000000, GregorianCalendar contractstart = new GregorianCalendar(2011,11,4), GregorianCalendar contractend = new GregorianCalendar(2019,4,30));
        DBHelper.save(player5);

        Player player6 = new Player("James Van Riemsdyk", team3, Position.LEFTWING, 25, 4250000, GregorianCalendar contractstart = new GregorianCalendar(2011,8,30), GregorianCalendar contractend = new GregorianCalendar(2018,4,30));
        DBHelper.save(player6);
    }
}
