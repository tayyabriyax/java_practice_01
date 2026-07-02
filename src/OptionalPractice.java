import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        Optional<Address> name = getAddress();

        name.map(x -> x.city)
            .map(x -> x.name)
            .ifPresent(System.out::println);
    }

    public static Optional<Address> getAddress() {
        City city = new City();
        city.name = "Bahawalpur";

        Address address = new Address();
        address.city = city;

        return Optional.ofNullable(address);
    }
}

class Address {
    City city;
}

class City {
    String name;
}