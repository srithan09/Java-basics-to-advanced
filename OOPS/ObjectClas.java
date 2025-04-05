class Laptop {
   String model;
   int price;

    public Laptop(String model , int price ) {
        this.model = model;
        this.price = price;
    }
   public String toString() {
        return "Model: " + model + ", Price: " + price;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return price == laptop.price && model.equals(laptop.model);
    }
    public int hashCode() {
        return 31 * model.hashCode() + price;
    }

}
public class ObjectClas {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 50000);
        Laptop l2 = new Laptop("HP", 60000);
        Laptop l3 = new Laptop("Lenovo", 70000);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
    
}
