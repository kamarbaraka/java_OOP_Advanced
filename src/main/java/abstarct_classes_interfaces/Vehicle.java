package abstarct_classes_interfaces;

class VehicleTest{

    public static void main(String[] args) {
        var car = new Car(4, 4, 1_200_000);
        var boat = new Boat(12, 4_500_000);

        car.doVehicleSound();
        System.out.println(car.showVehicleDetails());
        boat.doVehicleSound();
        System.out.println(boat.showVehicleDetails());

        System.out.println(boat.getBoatWeightAndSpeed());
    }
}

public abstract class Vehicle {

    private String type;
    private int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public String showVehicleDetails(){
        return "%s[type= %s, numberOfWheels= %s]\n".formatted(this.getClass().getSimpleName(), this.type, this.numberOfWheels);
    }

    public abstract String doVehicleSound();
}

class Car
    extends Vehicle{

    private int numberOfDoors;
    private double carPrice;

    public Car(int wheels, int doors, double price){
        super("car", wheels);
        this.carPrice = price;
        this.numberOfDoors = doors;
    }

    @Override
    public String showVehicleDetails() {
        System.out.printf("this car has %s doors\n", this.numberOfDoors);
        return super.showVehicleDetails();
    }

    @Override
    public String doVehicleSound() {
        System.out.println("Vroooooom!");
        return "Vrooooom!";
    }
}

class Boat
    extends Vehicle{

    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("boat", 0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public String doVehicleSound() {
        System.out.println("shhhhhhhhh!");
        return "shhhhhhhh!";
    }

    public String getBoatWeightAndSpeed(){
        return "the weight is %s kgs and speed is %s knots \n".formatted(this.boatKilosWeight, this.maxKnotsSpeed);
    }
}
