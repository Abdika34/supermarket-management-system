public class Supplier extends Item {
    private String contact;

    public Supplier(String name, String contact) {
        super(name);
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Supplier{name='" + getName() + "', contact='" + contact + "'}";
    }
}