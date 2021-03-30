package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Иванович", "математика");
        Student student = new Student("Петр");

        teacher.evaluate(student);
    }
}
