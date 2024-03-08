package march_8;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;


public class hashSet {

    public static class Student{
        String name;
        int reg;

        public Student(String name, int reg) {
            this.name = name;
            this.reg = reg;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", reg=" + reg +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return reg == student.reg;
        }

        @Override
        public int hashCode() {
            return Objects.hash(reg);
        }
    }

    public static void main(String[] args) {

        HashSet<Student> st = new LinkedHashSet<>();
        st.add(new Student("A", 1));
        st.add(new Student("B", 2));
        st.add(new Student("C", 3));
        st.add(new Student("D", 2));
        System.out.println(st);
    }
////        HashSet<Integer> st = new HashSet<>();
//        HashSet<Integer> st = new LinkedHashSet<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter set size: ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            st.add(sc.nextInt());
//        }
//        System.out.println(st);
//
//        st.remove(2);
//
//        System.out.println(st);
//        System.out.println(st.contains(2));
//    }
}
