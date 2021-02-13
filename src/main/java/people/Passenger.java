package people;

import flight.Flight;

import java.util.HashMap;

public class Passenger extends Person{

    private int numOfBags;
    private int seatNumber;
    private Flight flight;

    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags = numOfBags;
        this.seatNumber = 0;
        this.flight = null;
    }

    public int getNumOfBags() {
        return this.numOfBags;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public String GetFlightDetails(){
        return flight.getDestination() + " " + flight.getDpartTime() + " " + flight.getFlightNum();
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
