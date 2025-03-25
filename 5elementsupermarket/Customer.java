public class Customer extends Item {
    public Customer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Customer{name='" + getName() + "'}";
    }
}