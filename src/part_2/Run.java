package part_2;

public interface Run {
    abstract String getName();
    abstract int getMaxSpeed();
    abstract int getWeight();
    abstract void move(int count_machine);
}
