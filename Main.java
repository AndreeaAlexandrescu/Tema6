package SwimBreathWalk;

public class Main{

    public static void main(String[]args){

        Walker myWalker = new Walker();
        Swimmer mtSwimmer = new Swimmer();
        myWalker.walk();
        myWalker.breath();
        mtSwimmer.swim();
        mtSwimmer.breath();

    }
}
