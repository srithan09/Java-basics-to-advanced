package Student;

public class CollegeStudent implements Academic, Sports, Cultural {
    private String name;
    
    public CollegeStudent(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying for exams");
    }

    @Override
    public void submitAssignment() {
        System.out.println(name + " submitted the assignment");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing basketball");
    }

    @Override
    public void train() {
        System.out.println(name + " is training for sports day");
    }

    @Override
    public void perform() {
        System.out.println(name + " is performing in the annual day");
    }

    @Override
    public void practice() {
        System.out.println(name + " is practicing for cultural event");
    }

    // Resolving default method conflict
    @Override
    public void participate() {
        Sports.super.participate();  // Calling Sports interface default method
    }
}
