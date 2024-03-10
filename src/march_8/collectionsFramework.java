package march_8;

import java.util.*;

public class collectionsFramework {
    static class Student implements Comparable<Student>{
        String name;
        int num;

        public Student(String name, int num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", num=" + num +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return num == student.num;
        }

        @Override
        public int hashCode() {
            return Objects.hash(num);
        }

        @Override
        public int compareTo(Student that) {
            return this.num - that.num;
        }
    }

    public static void main(String[] args) {
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("A",1));
        arr.add(new Student("C",3));
        arr.add(new Student("B",1));
        arr.add(new Student("E",5));
        arr.add(new Student("D",1));


        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(arr);

    }
}
