import java.util.Iterator;

public class IterablePractice {
    public static void main(String[] args) {
        String[] names = { "Tayyab", "Umair", "Arslan", "Hasin" };
        NamesCollection container = new NamesCollection(names);

        Iterator<String> iterator = container.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

// Custom Collection Class
class NamesCollection implements Iterable<String> {
    String[] names;
    int size;

    NamesCollection(String[] names) {
        this.names = names;
        this.size = this.names.length;
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int cursorPosition = 0;

            @Override
            public boolean hasNext() {
                return cursorPosition < size;
            }

            @Override
            public String next() {
                return names[cursorPosition++];
            }
        };
    }
}