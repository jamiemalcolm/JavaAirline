package plane;

import enums.PlaneType;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }
}
