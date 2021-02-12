import enums.PlaneType;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }
    @Test
    public void planeHasCapacity(){
        assertEquals(400, plane.getCapacity());
    }
    @Test
    public void planeHasWeight(){
        assertEquals(300, plane.getWeight());
    }
}
