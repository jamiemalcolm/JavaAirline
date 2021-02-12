package flight;

import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import plane.Plane;

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
    }

    public int getNumPilots() {
        return this.pilots.size();
    }

    public int getNumCabinCrew() {
        return this.cabinCrew.size();
    }
}
