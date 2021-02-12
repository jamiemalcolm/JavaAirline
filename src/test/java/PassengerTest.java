import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger = new Passenger("Billy", 1);
        passenger2 = new Passenger("Harry", 2);
        passenger3 = new Passenger("Sam", 3);
    }
    @Test
    public void hasName(){
        assertEquals("Billy", passenger.getName());
    }
}
