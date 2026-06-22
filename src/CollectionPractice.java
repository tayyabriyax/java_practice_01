import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Tayyab Riaz");
        listOfNames.add("Umair Ilyas");
        listOfNames.add("Arslan Mustafa");

        listOfNames.addAll(List.of("Hammad Ahmad", "Saad Ahmad"));

        // for (String name : listOfNames) {
        // System.out.println(name);
        // }

        try (Scanner scanner = new Scanner(System.in)) {
            String inputStringOfNames = scanner.nextLine();

            String[] inputArrayOfNames = inputStringOfNames.split(",");

            List<String> inputListOfNames = new ArrayList<>();

            for (String name : inputArrayOfNames) {
                inputListOfNames.add(name);
            }

            System.out.println(inputListOfNames);
        }
    }
}