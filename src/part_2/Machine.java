package part_2;

public abstract class Machine implements Run {
    String name;
    int max_speed;
    int weight;
    int passengers;

    public Machine(String name, int max_speed, int weight, int passengers) {
        this.name = name;
        this.max_speed = max_speed;
        this.weight = weight;
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return max_speed;
    }

    public int getWeight() {
        return weight;
    }

    public void move(int count_machine) {
        System.out.println("Machine " + this.name + "№" + count_machine + " moves");
    }
}
