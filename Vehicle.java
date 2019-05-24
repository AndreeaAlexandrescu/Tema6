package Vehicle;

public abstract class Vehicle {
    private int speed;
    private int gear;

    public void changeGear(int newGear) {
        this.gear = newGear;

    }


    public void setGear(int G) {
        this.gear = G;
    }

    public void speedUp(int increment) {
        this.speed = increment;
    }

    public void applyBreaks(int decrement) { this.speed = decrement; }


    public abstract void printState ();
    public void ObjectState () {
            System.out.println("Show object state ");
    }
}








