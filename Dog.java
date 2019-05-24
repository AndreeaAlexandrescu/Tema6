package Tema6;

public class Dog extends Animal {
    private String color;

    public Dog(int age, int numerOfLegs, boolean vegetarian, String color) {
        super(age, numerOfLegs, vegetarian);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

        public void bark(){

        }
    @Override
    public String toString () {
        return "Age" + this.age + " numberOfLegs" + this.numberOfLegs + " vegetarian" + this.vegetarian + " color" + this.color + "\n";
    }

}









