package Functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functional {

    public static void main(String[] args) {


        System.out.println("---- Predicate ----");

        /*
         * predicate is a functional interface (has only one abstract method i.e test)
         * takes in one arg and returns a boolean
         * is in the form Predicate<T> where T is the input

        Predicate<Integer> num = x -> x.equals(5);

        Predicate<Integer> num2 = x -> x%2 == 0;

        System.out.println("Is num equal to 5: "+num.test(5));

        System.out.println("Opposite; Is num equal to 5: "+num.negate().test(5));

        System.out.println("Joining with and :"+num.and(num2).test(6));

        System.out.println("Joining with or :"+num.or(num2).test(6)); */

        System.out.println("---- Function ----");

        /*
            * Function is a functional interface that takes in one arg and return an object
            * the only abstract method is apply, R apply(T t)
            * is in the form Function<T,R> where T is the input and R is the output

        Function<Integer, Boolean> fun = x -> x%2 == 0;

        Function<Integer, Integer> doubleIt = x -> x*2;

        Function<Integer, Integer> cubeIt = x -> x*x*x;

        System.out.println("Is even: "+fun.apply(11));

        System.out.println("Doubled: "+doubleIt.apply(2));

        System.out.println("Double and cube result: "+doubleIt.andThen(cubeIt).apply(2));

        System.out.println("Cube and double result: "+doubleIt.compose(cubeIt).apply(2)); */

        System.out.println("---- Supplier ----");

        /*
            * this is a function interface used to return a value.
            * in the form Supplier<T>, and returns value using abstract method T get().
        Supplier<String> supplier = () -> "Kenya";

        System.out.println("From supplier is: "+supplier.get()); */

        System.out.println("---- Consumer ----");

        /*
            * functional interface used to accept any data and processes data
        Consumer<Integer> consumer = (x) -> {
            System.out.println("Consumed "+x*10);
        } ;

        consumer.accept(10); */

    }
}
