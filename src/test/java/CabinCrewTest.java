import enums.Rank;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Frank", Rank.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Fran", Rank.FLIGHTATTENDANT);
        cabinCrew3 = new CabinCrew("Fern", Rank.FLIGHTATTENDANT);
    }
    @Test
    public void hasName(){
        assertEquals("Frank", cabinCrew.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrew2.getRank());
    }
}
