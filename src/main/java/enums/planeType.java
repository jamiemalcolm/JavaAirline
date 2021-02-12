package enums;

public enum planeType {
    BOEING747(400, 300),
    BOEING737(200, 250),
    BOEING727(100, 150),
    AIRBUSA320(500, 450);

    private final int capacity;
    private final int weight;

    planeType(int capacity, int weight) {
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
