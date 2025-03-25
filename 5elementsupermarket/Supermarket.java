import java.io.*;
import java.util.ArrayList;

public class Supermarket {
    private ArrayList<Item> items; // List to store items
    private final String dataFile = "data.txt"; // File for data persistence

    public Supermarket() {
        items = new ArrayList<>(); // Initialize the ArrayList
        loadData(); // Load existing data from the file
    }

    public void addItem(Item item) {
        items.add(item); // Add the item to the list
        saveData(); // Save data after adding a new item
        System.out.println("Added: " + item);
    }

    public void viewItems(Class<?> itemType) {
        System.out.println(itemType.getSimpleName() + "s:");
        boolean found = false;
        for (Item item : items) {
            if (itemType.isInstance(item)) {
                System.out.println(item); // Print item if it matches the type
                found = true;
            }
        }
        if (!found) {
            System.out.println("No " + itemType.getSimpleName().toLowerCase() + "s available.");
        }
    }

    private void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile))) {
            oos.writeObject(items); // Serialize the items ArrayList
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile))) {
            items = (ArrayList<Item>) ois.readObject(); // Deserialize items from the file
        } catch (FileNotFoundException e) {
            System.out.println("Data file not found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}