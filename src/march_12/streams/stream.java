package march_12.streams;

import java.util.List;
import java.util.stream.Collectors;

import static march_12.streams.stream.Gender.*;


public class stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("JOHN", MALE),
                new Person("MARIA",FEMALE),
                new Person("AISHA", FEMALE),
                new Person("ALEX",MALE),
                new Person("ALICE",FEMALE),
                new Person("BOB", BINARY)
        );

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> person.gender.equals(FEMALE));

        System.out.println(containsOnlyFemales);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, BINARY
    }
}
