import java.util.*;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Employ> students = new ArrayList<>();
        students.add(new Employ("John Soap", 101));
        students.add(new Employ("John Price", 103));
        students.add(new Employ("Farah Karim", 102));
        students.add(new Employ("Makarov", 104));

        List<String> studentsNames = students.stream()
                .filter(x -> x.regNo > 102)
                .map(x -> x.getName())
                .toList();

        System.out.println(studentsNames);
    }
}

class Employ {
    String name;
    int regNo;

    Employ(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public String getName() {
        return this.name;
    }
}