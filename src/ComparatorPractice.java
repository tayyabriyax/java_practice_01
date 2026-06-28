import java.util.*;

public class ComparatorPractice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tayyab Riaz", 4, "C"));
        students.add(new Student("Hammad Ahmad", 2, "A"));
        students.add(new Student("Saad Ahmad", 3, "B"));
        students.add(new Student("Maaz Ahmad", 1, "D"));

        // By Passing Object
        Collections.sort(students, new sortByName());
        // By Passing Lambda
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String grade;

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + ", Roll No : " + this.rollNo + ", Grade : " + this.grade;
    }
}

class sortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class sortByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

class sortByGrade implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.grade.compareTo(s2.grade);
    }
}