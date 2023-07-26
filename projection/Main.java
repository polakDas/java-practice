package projection;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Name-1", 10),
                new Person("Name-2", 20),
                new Person("Name-3", 25),
                new Person("Name-4", 30)
        );

        List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());

//        for(String name: names) {
//            System.out.println(name);
//        }
        names.forEach((name) -> System.out.println(name));
    }
}
