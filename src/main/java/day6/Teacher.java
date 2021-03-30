package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        int mark_number = (int) (Math.random() * 4 +2);
        String mark_string = "";
        switch (mark_number) {
            case 2:
                mark_string = "неудовлетворительно";
                break;
            case 3:
                mark_string = "удовлетворительно";
                break;
            case 4:
                mark_string = "хорошо";
            case 5:
                mark_string = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " +
                student.getName() + " по предмету " + subject + " на оценку " + mark_string + ".");
    }
}
