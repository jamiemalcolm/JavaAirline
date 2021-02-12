package people;

import enums.Rank;

public class CabinCrew extends Person{

    private Rank rank;

    public CabinCrew(String name, Rank rank){
        super(name);
        this.rank = rank;
    }
}
