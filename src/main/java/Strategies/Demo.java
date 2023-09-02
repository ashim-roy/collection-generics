package Strategies;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        //way-1: create a class implementing interface.
        Foo foo = new FooImpl();
        // now i can use that method also..

        foo.bar("x");

        //way-2: Use anonymous class.
        Foo foo1 = new Foo(){

            @Override
            public void bar(String s) {
                System.out.println("using anonymous class" + s);
            }
        };
        foo1.bar("X");

        // Way-3 : Lambda

        Foo foo2 = (a) -> {
            System.out.println("Using Lambda function" + a);
        };

        foo2.bar("X");

      // using annoymous..
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running a thread" +
                        Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("second print in Thread: "
                + Thread.currentThread().getName());

//Lambda

        Thread t1 = new Thread(() -> {
            System.out.println("Printing in Lambda: " +
                    Thread.currentThread().getName());
        });
        t1.start();

        Consumer <String> consumerobj = (a) -> {
            System.out.println(a);
        };
// calling
        consumerobj.accept("Bleh");

        //predicate
        Predicate<String> predicateobj = (a) -> {
            return a.length() > 10;
        };
        System.out.println(predicateobj.test("my name is ashim"));
      // one liner predicate
        Predicate <String> predicate1 = (a) -> a.length() > 10;
        System.out.println(predicate1.test("chobdar"));


        //Stream

        Integer[] array = {71, 2,3 , 4, 5};

        for (Integer integer : array) {
            if (integer > 3) {
                System.out.println("hi");
            }
        }

        Stream<Integer>  arrayStream = Stream.of(array);
        Predicate<Integer> predicate2 = (a) -> {
            return a> 3;
        };
        System.out.println(arrayStream.filter(predicate2).toList());

        //odd numbers.
        Integer[] array2 = {1, 2, 3 , 7, 9, 11, 4, 5};
        Stream<Integer>  arrayStream2 = Stream.of(array2);
        Predicate<Integer> predicate3 = (a) -> {
            return a%2 ==1;
        };
        System.out.println(arrayStream2.filter(predicate3).toList());

        //sqr of odd numbers..
        Stream<Integer>  arrayStream3 = Stream.of(array2);
        System.out.println(arrayStream3.filter(a -> a%2 ==1).map(a -> a*a).toList());


        //easier way:
        Function<Integer, Integer> func = (a) -> {
            return a*a;
        };

        //import java.util.List;
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list.stream().map(func).toList());

        //consumer example
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
        list3.forEach(a -> System.out.println("consumer: " + a));

    }

}
