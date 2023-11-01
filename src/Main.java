// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car cars = new Car();
        System.out.println(cars.toString());
        cars.sell();

        System.out.println("Model is " + cars.getModel());
        System.out.println("Brand is " + cars.getBrand());
        System.out.println("Colour is " + cars.getColor());
        System.out.println("Year is " + cars.getYear());
        System.out.println("Price is " + cars.getPrice());

        cars.setColor("green");
        cars.setYear(1996);

        System.out.println(cars.toString());

    }
}