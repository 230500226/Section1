package vehicleQ2;
// Test class to demonstrate inheritance
public class TestVehicles {
    public static void main2(String[] args) {
        Car car = new Car("Toyota", "Camry", 2023, 5);
        Truck truck = new Truck("Ford", "F-150", 2023, 2.5);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2023, false);

        System.out.println("Car: " + car.getBrand() + " " + car.getModel() + ", Year: " + car.getYear() + ", Passengers: " + car.getNumberOfPassengers());
        System.out.println("Truck: " + truck.getBrand() + " " + truck.getModel() + ", Year: " + truck.getYear() + ", Load Capacity: " + truck.getLoadCapacity() + " tons");
        System.out.println("Motorcycle: " + motorcycle.getBrand() + " " + motorcycle.getModel() + ", Year: " + motorcycle.getYear() + ", Has Sidecar: " + motorcycle.hasSidecar());
    }
}
