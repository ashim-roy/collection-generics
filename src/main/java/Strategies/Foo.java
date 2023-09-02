package Strategies;

@FunctionalInterface
public interface Foo {
    void bar(String s);
    default void bar2(){
        System.out.println("a default method in foo");
    }
}
