package enums;

public enum PlaneType {
    TESTPLANE(2, 20),
    BOEING747(400, 300),
    BOEING737(200, 250),
    BOEING727(100, 150),
    AIRBUSA320(500, 450);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
