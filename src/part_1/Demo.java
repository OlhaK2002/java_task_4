package part_1;

public class Demo {
    public static void main(String[] args) {
        Server server = new Server(4, 6);
        while (server.getCurrentCountVehicle() < server.getLimitVehicle()) {
            int type_vehicle = (int)(Math.random() * 3);
            switch (type_vehicle) {
                case 1:
                    server.addTransport(0, new Car());
                    break;
                case 2:
                    server.addTransport(1, new Bicycle());
                    break;
                case 3:
                    server.addTransport(2, new RollerSkates());
                    break;
                default:
                    server.addTransport(3, new Jumpers());
                    break;
            }
        }
        int[] count_vehicles = server.getCountVehicles();
        System.out.println("Count cars = " + count_vehicles[0]);
        System.out.println("Count bicycles = " + count_vehicles[1]);
        System.out.println("Count roller skates = " + count_vehicles[2]);
        System.out.println("Count jumpers = " + count_vehicles[3]);
    }
}
