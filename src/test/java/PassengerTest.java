import enums.PlaneType;
import enums.Rank;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import plane.Plane;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;
    Flight flight;
    Pilot pilot;
    Pilot pilot2;
    Pilot pilot3;
    CabinCrew cabinCrew;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Plane plane;

    @Before
    public void before(){
        passenger = new Passenger("Billy", 1);
        passenger2 = new Passenger("Harry", 2);
        passenger3 = new Passenger("Sam", 3);
        pilot = new Pilot("Sully", Rank.CAPTAIN, "PL123");
        pilot2 = new Pilot("Bob", Rank.FIRSTOFFICER, "PL124");
        pilot3 = new Pilot("Ted", Rank.SECONDOFFICER, "PL125");
        cabinCrew = new CabinCrew("Frank", Rank.FLIGHTATTENDANT);
        cabinCrew2 = new CabinCrew("Fran", Rank.FLIGHTATTENDANT);
        cabinCrew3 = new CabinCrew("Fern", Rank.FLIGHTATTENDANT);
        plane = new Plane(PlaneType.TESTPLANE);
        ArrayList<Pilot> testPilots = new ArrayList<Pilot>();
        testPilots.add(pilot);
        testPilots.add(pilot2);
        testPilots.add(pilot3);
        ArrayList<CabinCrew> testCrew = new ArrayList<CabinCrew>();
        testCrew.add(cabinCrew);
        testCrew.add(cabinCrew2);
        testCrew.add(cabinCrew3);

        flight = new Flight(testPilots, testCrew, plane, "FR455", "LAX", "EDN", "2021-02-12, 12.35");


    }
    @Test
    public void hasName(){
        assertEquals("Billy", passenger.getName());
    }

    @Test
    public void hasSeatNumber0toStart(){
        assertEquals(0, passenger.getSeatNumber());
    }
    @Test
    public void hasNullFlightToStart(){
        assertEquals(null, passenger.getFlight());
    }
    @Test
    public void hasFlightOnceBooked(){
        flight.bookPassenger(passenger);
        assertEquals(flight, passenger.getFlight());
    }
//    @Test passenger canGetFlightDetailsOnceBooked(){
//        flight.bookPassenger(passenger);
//        assertEquals("LAX 2021-02-12, 12.35 FR455", passenger.GetFlightDetails());
//    }
}
