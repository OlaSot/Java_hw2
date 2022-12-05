public class Laptop {
    private int price;
    private double model;
    private String brand;

    public Laptop(int price, double model, String brand) {
        this.price = price;
        this.model = model;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getModel() {
        return model;
    }

    public void setModel(double model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printOut(){
        System.out.println(" price : " + price + " model : " + model + " brand : " + brand);
    }
}
