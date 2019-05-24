package Vehicle;

public class MainVehicle {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.changeGear(2);
        truck.speedUp(3);
        truck.applyBreaks(1);
        truck.printState();

        Bus bus = new Bus();
        bus.changeGear(1);
        bus.speedUp(4);
        bus.applyBreaks(2);
        bus.printState();
    }


}
