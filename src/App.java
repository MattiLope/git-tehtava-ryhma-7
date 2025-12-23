public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Toyota", "Corolla", 2007);
        car1.printData();
    }
}
// Car class
class Car {
    public String brand;
    public String model;
    public int modelYear;

    // Default constructor
    public Car() {
        brand = "Toyota";
        model = "Corolla";
        modelYear = 2007;
    }
    // Constructor with all parameters
    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        modelYear = y;
    }
    // Function to print data from object
    public void printData() {
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Model year is: " + modelYear);

    }
    // Additional helper method added by Karina     
    public void printInfo() {
        System.out.println("Car: " + brand + " " + model + " " + modelYear);
    }

}

