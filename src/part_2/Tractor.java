package part_2;

public abstract class Tractor extends Machine{
    String type;

    public Tractor(String name, int max_speed, int weight, int passengers, String type) {
        super(name, max_speed, weight, passengers);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
