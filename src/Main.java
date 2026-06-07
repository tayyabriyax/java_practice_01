public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Hammad Ahmad";
        s1.age = 22;
        s1.rollNo = 16;
        s1.college = "Punjab Group Of Colleges";
        s1.hobbies[0] = "Reading";
        s1.hobbies[1] = "Playing";

        s1.printDetails();
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String college;
    String[] hobbies = new String[2];

    void read() {
        System.out.println("Student is reading...");
    }

    void write() {
        System.out.println("Student is writing...");
    }

    void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My roll number is " + rollNo);
        System.out.println("My college is " + college);
        System.out.println("My hobbies are " + hobbies[0] + ", " + hobbies[1]);
    }
}