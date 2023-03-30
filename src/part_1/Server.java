package part_1;

public class Server {
    // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int[] countVehicles;
    // загальна кількість ТЗ, що виїхали в місто
    private int commonCountVehicles;
    // обмеження на кількість ТЗ, що одночасно виїхали в місто
    private int limitVehicle;

    // масив, що зберігає ТЗ будь-якого виду
    private Vehicle[] vehicles;

    // конструктор класу, параметр size – кількість видів ТЗ
    public Server(int size, int limitVehicles) {
        countVehicles = new int[size];
        limitVehicle = limitVehicles;
        vehicles = new Vehicle[limitVehicle];
    }

    // повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
    public int getLimitVehicle() {
        return limitVehicle;
    }

    public int[] getCountVehicles() {
        return countVehicles;
    }

    // повертає загальну кількість ТЗ, що виїхали в місто
    public int getCurrentCountVehicle() {
        return commonCountVehicles;
    }

    // додає ТЗ до віртуальної бази
    public void addTransport(int numberVehicles, Vehicle vehicle) {
        countVehicles[numberVehicles]++;
        vehicles[commonCountVehicles] = vehicle;
        commonCountVehicles++;
        vehicle.move(countVehicles[numberVehicles]);
    }
}