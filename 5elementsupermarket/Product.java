public class Product extends Item {
    private double price;

    public Product(String name, double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + getName() + "', price=" + price + "}";
    }
}