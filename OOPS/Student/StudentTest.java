package Student;

public class StudentTest {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent("John");
        
        // Academic activities
        student.study();
        student.submitAssignment();
        student.attendClass();
        
        // Sports activities
        student.play();
        student.train();
        student.participate();
        
        // Cultural activities
        student.perform();
        student.practice();
    }
}