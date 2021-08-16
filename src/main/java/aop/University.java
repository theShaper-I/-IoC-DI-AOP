package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Artem Hrybanov", 3, 63);
        Student st2 = new Student("Vova Stynskii", 2, 56);
        Student st3 = new Student("Alexandr Fedoryshin", 3, 79);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Starting work of method getStudents");
        // For throw of exeption
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
