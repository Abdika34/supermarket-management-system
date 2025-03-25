public class Employee extends Item {
    private String role;

    public Employee(String name, String role) {
        super(name);
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', role='" + role + "'}";
    }
}