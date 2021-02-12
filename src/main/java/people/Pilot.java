package people;

import enums.Rank;

public class Pilot extends CabinCrew{

    private String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence){
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getLicence() {
        return this.pilotLicence;
    }

    public String flyPlane() {
        return "Wooosh!";
    }
}
