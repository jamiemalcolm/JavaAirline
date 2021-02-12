import enums.PlaneType;
import enums.Rank;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.FlightManager;
import people.Passenger;
import people.Pilot;
import plane.Plane;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    Pilot pilot2;
    Pilot pilot3;
    CabinCrew cabinCrew;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Plane plane;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        pilot = new Pilot("Sully", Rank.CAPTAIN, "PL123");
        pilot2 = new Pilot("Bob", Rank.FIRSTOFFICER, "PL124");
        pilot3 = new Pilot("Ted", Rank.SECONDOFFICER, "PL125");
        cabinCrew = new CabinCrew("Frank", Rank.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Fran", Rank.FLIGHTATTENDANT);
        cabinCrew3 = new CabinCrew("Fern", Rank.FLIGHTATTENDANT);
        plane = new Plane(PlaneType.TESTPLANE);
        passenger = new Passenger("Billy", 1);
        passenger2 = new Passenger("Harry", 1);
        passenger3 = new Passenger("Sam", 3);
        ArrayList<Pilot> testPilots = new ArrayList<Pilot>();
        testPilots.add(pilot);
        testPilots.add(pilot2);
        testPilots.add(pilot3);
        ArrayList<CabinCrew> testCrew = new ArrayList<CabinCrew>();
        testCrew.add(cabinCrew);
        testCrew.add(cabinCrew2);
        testCrew.add(cabinCrew3);
        flight = new Flight(testPilots, testCrew, plane, "FR455", "LAX", "EDN", "2021-02-12, 12.35");
        flightManager = new FlightManager("Dan", flight);
    }
    @Test
    public void setFlightManagerHasName(){
        assertEquals("Dan", flightManager.getName());
    }
    @Test
    public void canCalculateWeightReservedForOnePassenger(){
        assertEquals(5, flightManager.calculateWeightAllowedForOnePassengersBags());
    }
    @Test
    public void canCalculateWeightReservedFallAllPassengers(){
        assertEquals(10, flightManager.bagadgeWeightAllowance());
    }
    @Test
    public void canCalculateBagadgeAfterPassengerAdded(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
        assertEquals(0, flightManager.bagadgeWeightAllowance());
    }


}
