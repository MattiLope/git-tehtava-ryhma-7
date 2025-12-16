public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Toyota", "Corolla");
        car1.printData();
    }
}
// Car class
class Car {
    public String brand;
    public String model;

    // Default constructor
    public Car() {
        brand = "Toyota";
        model = "Corolla";
    }
    // Constructor with all parameters
    public Car(String b, String m) {
        brand = b;
        model = m;
    }
    // Function to print data from object
    public void printData() {
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
    }
    // Additional helper method added by Karina     
    public void printInfo() {
        System.out.println("Car: " + brand + " " + model);
    }

}

