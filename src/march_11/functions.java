package march_11;

import java.util.function.BiFunction;
import java.util.function.Function;

public class functions {
    public static void main(String[] args) {
        //Function
        int increment = incrementByOne.apply(1);
        System.out.println(increment);


        //Chaining
        int incrementAndMultiply = multiplyBy10.apply(incrementByOne.apply(1));
        System.out.println(incrementAndMultiply);


        //Bi function
        int incrementAndMultiplyBy = incrementByOneAndMultiply.apply(4,10);
        System.out.println(incrementAndMultiplyBy);

    }

    static Function<Integer,Integer> incrementByOne = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10 = number -> number * 10;

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiply =
        (numberToIncrement, numberToMultiplyBy)
                -> (numberToIncrement + 1) * numberToMultiplyBy;
}
