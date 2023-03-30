package part_2;

public class Demo {
    public static void main(String[] args) {
        Server server = new Server(4, 6);
        while (server.getCurrentCountMachine() < server.getLimitMachine()) {
            Machine machine;
            int type_machine = (int)(Math.random() * 3);
            switch (type_machine) {
                case 1:
                    machine = new TractorCrawler("TractorCrawler", 80, 4000, 2, "crawler");
                    break;
                case 2:
                    machine = new TractorWheeled("TractorWheeled", 60, 4500, 1, "wheeled");
                    break;
                default:
                    machine = new Bus("Bus", 120, 1000, 4, 14);
                    break;
            }
            server.addTransport(type_machine, machine);
        }
        int[] count_machines = server.getCountMachines();
        System.out.println("Count bus = " + count_machines[0]);
        System.out.println("Count tractor crawler = " + count_machines[1]);
        System.out.println("Count tractor wheeled = " + count_machines[2]);
    }
}
