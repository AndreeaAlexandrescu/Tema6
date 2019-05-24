package Tema6;

public class MainAnimal {
    public static void ReceiveAnimal(Animal animal) {
        System.out.println(animal.toString());
    }
    public static void main(String[] args) {
        Animal animal = new Animal(2,4,false);
        System.out.println("Age:"+animal.getAge());
        System.out.println("NumberOfLegs:"+animal.getNumberOfLegs());
        System.out.println("Vegetarian:"+animal.getVegetarian());
        Dog dog = new Dog(4,4,false,"white");
        System.out.println("Age:"+dog.getAge());
        System.out.println("NumberOfLegs:"+dog.getNumberOfLegs());
        System.out.println("Vegetarian:"+dog.getVegetarian());
        System.out.println("Color:"+dog.getColor());
        Animal dog2 = new Dog(3, 4,false, "yellow");
        System.out.println("Age:"+dog2.getAge());
        System.out.println("NumberOfLegs:"+dog2.getNumberOfLegs());
        System.out.println("Vegetarian:"+dog2.getVegetarian());
        dog.bark();
        System.out.println(animal.toString());
        System.out.println(dog.toString());
        Animal animal2 = new Animal(5, 8, true);
        Animal dog3 = new Animal(1,2, true);
        System.out.println(animal2.toString());
        System.out.println(dog3.toString());
        ReceiveAnimal(animal2);
        ReceiveAnimal(dog2);
        ReceiveAnimal(dog2);
    }
}
