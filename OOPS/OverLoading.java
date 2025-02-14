class Car{
    public void start(){
        System.out.println("Car is starting");
    }
    public void start(boolean isKey){
        System.out.println("Car is starting with key");
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.start(true);
        
    }
    
}
