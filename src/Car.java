public class Car {
    private String model;
    private String brand;
    private String color;
    private int year;
    private float price;
    private int quantity;

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {

        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery() {
        quantity++;

    }

    public void sell() {
        quantity--;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    //Additionally, we create a delivery() method (simulating car delivery) and sell()
    // (simulating car sales) which change the value
    //of the quantity field.

    //The last method we create is the toString() method that returns an object of type String
    // and prints it names of all fields of a
    //given object and their state or value.


}
