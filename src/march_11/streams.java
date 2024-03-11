package march_11;

import java.util.List;


import static march_11.streams.Gender.*;
public class streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("JOHN", MALE),
                new Person("MARIA",FEMALE),
                new Person("AISHA",FEMALE),
                new Person("ALEX",MALE),
                new Person("ALICE",FEMALE)
        );

        List<Person> females = people.stream()
                .filter(person -> person.gender.equals(FEMALE))
                .toList();
        females.forEach(System.out::println);
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
        MALE, FEMALE
    }
}
