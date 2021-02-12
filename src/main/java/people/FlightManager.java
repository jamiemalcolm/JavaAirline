package people;

import flight.Flight;

public class FlightManager extends Person{
     private Flight flight;

     public FlightManager(String name, Flight flight){
         super(name);
         this.flight = flight;
     }


    public int calculateWeightAllowedForOnePassengersBags() {
         int weightAllowance = this.flight.getPlane().getWeight() / 2;
         return weightAllowance / this.flight.getPlane().getCapacity();
    }

    public int bagadgeWeightAllowance() {
         int fullAllowance = this.flight.getPlane().getWeight() / 2;
         return fullAllowance - this.flight.getNumPassangers() * this.calculateWeightAllowedForOnePassengersBags();
    }
}
