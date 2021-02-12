import enums.Rank;
import org.junit.Before;
import org.junit.Test;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    Pilot pilot2;
    Pilot pilot3;

    @Before
    public void before(){
        pilot = new Pilot("Sully", Rank.CAPTAIN, "PL123");
        pilot2 = new Pilot("Bob", Rank.FIRSTOFFICER, "PL124");
        pilot3 = new Pilot("Ted", Rank.SECONDOFFICER, "PL125");
    }

    @Test
    public void hasName(){
        assertEquals("Sully", pilot.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.FIRSTOFFICER, pilot2.getRank());
    }
    @Test
    public void hasLicence(){
        assertEquals("PL125", pilot3.getLicence());
    }
}
