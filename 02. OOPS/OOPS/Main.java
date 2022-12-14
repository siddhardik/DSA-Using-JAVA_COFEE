class Student {
    private int studentId;

    public int getStudentId() { // getter method

        return studentId;
    }

    public void setStudentId(int Id) { // setter method

        studentId = Id;
    }

}

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        // stu.studentId=80; // Error
        stu.setStudentId(34);
        System.out.println(stu.getStudentId());

    }
}
