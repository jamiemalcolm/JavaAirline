package people;

import flight.Flight;

import java.util.HashMap;

public class Passenger extends Person{

    private int numOfBags;
    private HashMap<Flight, int> seatNumber;

    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags = numOfBags;
        this.seatNumber = new HashMap<Flight, int>();
    }

    public int getNumOfBags() {
        return this.numOfBags;
    }
}
