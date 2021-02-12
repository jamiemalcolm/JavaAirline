package people;

import enums.Rank;

public class Pilot extends CabinCrew{

    public String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence){
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }
}
