public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(
                "Umair Ilyas",
                21,
                16,
                "Punjab Group of Colleges"
        );

        s1.printDetails();
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String college;

    Student(){
        this("Unknown", 0, 0, "Unknown");
    }

    Student(String name){
        this(name, 0, 0, "Unknown");
    }

    Student(String name, int age){
        this(name, age, 0, "Unknown");
    }

    Student(String name, int age, int rollNo){
        this(name, age, rollNo, "Unknown");
    }

    Student(String name, int age, int rollNo, String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
    }

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
    }
}