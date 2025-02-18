class Student{
    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
}
public class ArrayObj {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student(1, "A");
        arr[1] = new Student(2, "B");
        arr[2] = new Student(3, "C");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].rollno + " " + arr[i].name);
        }
        
    }
    
}
