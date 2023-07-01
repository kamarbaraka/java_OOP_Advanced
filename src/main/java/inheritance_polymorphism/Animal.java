package inheritance_polymorphism;

import javax.management.MBeanNotificationInfo;

class AnimalTest{

    public static void main(String[] args) {
        var animal = new Animal("lion");

        System.out.println(animal.animalSound());
        System.out.println(animal.animalSound("high"));
        System.out.println(animal.animalSound("low"));
        System.out.println(animal.animalSound("other"));
    }
}

public class Animal {

    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String animalSound(){
        return "Roarr!";
    }

    public String animalSound(String intensity){
        if (intensity.equals("low"))
            return "Roar";
        if (intensity.equals("high"))
            return "Roarrrrrrrr!";
        return "Cannot Reproduce it properly";
    }
}
