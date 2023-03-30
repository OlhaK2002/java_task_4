package part_2;

public class Server {
    // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int[] countMachines;
    // загальна кількість ТЗ, що виїхали в місто
    private int commonCountMachines;
    // обмеження на кількість ТЗ, що одночасно виїхали в місто
    private int limitMachine;

    // масив, що зберігає ТЗ будь-якого виду
    private Machine[] machines;

    // конструктор класу, параметр size – кількість видів ТЗ
    public Server(int size, int limitMachines) {
        countMachines = new int[size];
        limitMachine = limitMachines;
        machines = new Machine[limitMachine];
    }

    // повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
    public int getLimitMachine() {
        return limitMachine;
    }

    public int[] getCountMachines() {
        return countMachines;
    }

    // повертає загальну кількість ТЗ, що виїхали в місто
    public int getCurrentCountMachine() {
        return commonCountMachines;
    }

    // додає ТЗ до віртуальної бази
    public void addTransport(int numberMachines, Machine machine) {
        countMachines[numberMachines]++;
        machines[commonCountMachines] = machine;
        commonCountMachines++;
        machine.move(countMachines[numberMachines]);
    }
}