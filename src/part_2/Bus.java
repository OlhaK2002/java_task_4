package part_2;

public class Bus extends Machine {
    int count_passengers;

    public Bus(String name, int max_speed, int weight, int passengers, int count_passengers) {
        super(name, max_speed, weight, passengers);
        this.count_passengers = count_passengers;
    }

    public int getCountPassengers() {
        return count_passengers;
    }
}
