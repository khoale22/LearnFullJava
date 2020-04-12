package JavaCollectionAndHashCodeEquals;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class StudentTest {
    private String id;
    private String name;
    private String email;
    private int age;

    public StudentTest(String id) {
        this.id = id;
    }

    public StudentTest(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
        return studentInfo;
    }

    public boolean equals(Object obj) {
        if (obj instanceof StudentTest) {
            StudentTest another = (StudentTest) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 + id.hashCode();
    }
}

public class HashSetNew {
    public static void main(String[] args) {
        StudentTest student1 = new StudentTest("123", "Cong", "cong@gmail.com", 22);
        StudentTest student2 = new StudentTest("123", "Cong5", "cong@gmail.com", 22);
        StudentTest student3 = new StudentTest("456", "Dung", "dung@gmail.com", 18);

        Set<StudentTest> setStudents = new HashSet<StudentTest>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);

        List<StudentTest> setStudents2 = new LinkedList<StudentTest>();
        setStudents2.add(student1);
        setStudents2.add(student2);
        setStudents2.add(student3);

        // in các phần tử của set ra màn hình
        for (StudentTest student : setStudents) {
            System.out.println(student);
        }

        // in các phần tử của list ra màn hình
        for (StudentTest student : setStudents2) {
            System.out.println(student);
        }
    }
}