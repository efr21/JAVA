package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Петр", "математики");
        Teacher teacher = new Teacher("Василий Петрович", "математика");
        student.getGroupName();
        teacher.getSubjectName();
        student.printInfo();
        teacher.printInfo();

    }
}
