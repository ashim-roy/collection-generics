package Strategies;

public class FooImpl implements Foo{
    @Override
    public void bar(String s){
        System.out.println("from class FooImpl" + s);
    }
}
