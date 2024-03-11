package march_11;

import java.util.function.Function;

public class functions {
    public static void main(String[] args) {
        int increment = incrementByOne.apply(1);
        System.out.println(increment);

        int incrementAndMultiply = multiplyBy10.apply(increment);
        System.out.println(incrementAndMultiply);
    }

    static Function<Integer,Integer> incrementByOne = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10 = number -> number * 10;
}
