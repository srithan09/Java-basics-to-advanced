package Student;
public interface Cultural {
    void perform();
    void practice();
    default void participate() {
        System.out.println("Participating in cultural event");
    }
}