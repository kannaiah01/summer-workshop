import java.util.ArrayList;
import java.util.Collections;

class Student {
    String name;
    int marks;
    int avg;

    Student(String name, int marks,int avg ) {
        this.name = name;
        this.marks = marks;
        this.avg = avg;
    }

    public String getName() {
        return name + " (" + marks + ", " + avg + ")";
    }
}

public class GradeManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("shyam", 85, 80));
        students.add(new Student("kannaiah", 92, 85));
        students.add(new Student("dinesh", 78, 75));

        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);

        for (Student s : students) {
            System.out.println(s.getName());
        }  
        // System.out.println("Top student: " + students.get(0).getName());
        int total = 0;
        for (Student s : students) {
            total += s.marks;
        }
        int average = total / students.size();
        System.out.println("Average marks: " + average);
        System.out.println("Total marks: " + total);
    }
}