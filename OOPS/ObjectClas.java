class Laptop {
    String brand;
    String model;
    int ramSize;
    int storageSize;

    public Laptop(String brand, String model, int ramSize, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Storage Size: " + storageSize + "GB");
    }

    
}
public class ObjectClas {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 16, 512);
        Laptop laptop2 = new Laptop("Apple", "MacBook Pro", 32, 1024);

        laptop1.displayInfo();
        System.out.println();
        laptop2.displayInfo();
    }
    
}
