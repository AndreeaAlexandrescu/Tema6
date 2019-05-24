package SwimBreathWalk;

public class Swimmer implements Swim, Breath {
    public void swim() {
        System.out.println("He swims very well");
    }

    public void breath() {
        System.out.println("He breath very well");
    }
}
