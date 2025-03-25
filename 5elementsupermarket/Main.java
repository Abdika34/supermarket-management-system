import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSupermarket Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Add Customer");
            System.out.println("4. View Customers");
            System.out.println("5. Add Employee");
            System.out.println("6. View Employees");
            System.out.println("7. Add Supplier");
            System.out.println("8. View Suppliers");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    supermarket.addItem(new Product(productName, productPrice));
                    break;
                case 2:
                    supermarket.viewItems(Product.class);
                    break;
                case 3:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    supermarket.addItem(new Customer(customerName));
                    break;
                case 4:
                    supermarket.viewItems(Customer.class);
                    break;
                case 5:
                    System.out.print("Enter employee name: ");
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter employee role: ");
                    String role = scanner.nextLine();
                    supermarket.addItem(new Employee(employeeName, role));
                    break;
                case 6:
                    supermarket.viewItems(Employee.class);
                    break;
                case 7:
                    System.out.print("Enter supplier name: ");
                    String supplierName = scanner.nextLine();
                    System.out.print("Enter supplier contact: ");
                    String contact = scanner.nextLine();
                    supermarket.addItem(new Supplier(supplierName, contact));
                    break;
                case 8:
                    supermarket.viewItems(Supplier.class);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);

        scanner.close();
    }
}