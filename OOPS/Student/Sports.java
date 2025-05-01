package Student;

public interface Sports {
    void play();
    void train();
    default void participate() {
        System.out.println("Participating in sports event");
    }
}