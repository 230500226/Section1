package vehicleQ2;

// Derived class for Car
class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(String brand, String model, int year, int numberOfPassengers) {
        super(brand, model, year);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
