package flight;

//import enums.DepartTimes;
import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import plane.Plane;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departAirport;
    private String departTime;
    private ArrayList<Passenger> passengers;
    private int emptySeats;





    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrew> cabinCrew, Plane plane, String flightNum,
                  String destination, String departAirport, String departTime){
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departTime = departTime;
        this.passengers = new ArrayList<Passenger>();
        this.emptySeats = plane.getCapacity();

    }

    public int getNumPilots() {
        return this.pilots.size();
    }

    public int getNumCabinCrew() {
        return this.cabinCrew.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartAirport() {
        return this.departAirport;
    }

    public String getDpartTime() {
        return this.departTime;
    }

    public int getEmptySeats() {
            return this.emptySeats;
    }

    public int getNumPassangers() {
        return this.passengers.size();
    }

    public int generateSeatNum(){
        return (int) ((Math.random()) * (this.getEmptySeats() - 1) + 1);
    }

    public String bookPassenger(Passenger passenger) {
        if(this.getEmptySeats() > 0) {
            this.passengers.add(passenger);
            this.emptySeats -= 1;
            passenger.setFlight(this);
            passenger.setSeatNumber(this.generateSeatNum());
            return "Booked";
        }
        return "Flight Full";
    }
}
