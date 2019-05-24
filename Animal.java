package Tema6;

public class Animal {

    public int age;
    public int numberOfLegs;
    public boolean vegetarian;

    public Animal(int age, int numerOfLegs, boolean vegetarian) {
        this.age = age;
        this.numberOfLegs = numerOfLegs;
        this.vegetarian = vegetarian;

    }

    public int getAge() {
        return age;

    }

    public void setAge(String username) {
        this.age = age;

    }


    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) { this.vegetarian = vegetarian; }

    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString () {
        return "Age" + this.age + " numberOfLegs" + this.numberOfLegs + "vegetarian" + this.vegetarian + "\n";
    }

}