package Student;

public interface Academic {
    void study();
    void submitAssignment();
    default void attendClass() {
        System.out.println("Attending class virtually or in-person");
    }
}