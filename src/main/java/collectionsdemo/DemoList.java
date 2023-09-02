package collectionsdemo;

import java.util.*;

public class DemoList {
    public static void main(String[] args) {
        /*List<Integer> list = new LinkedList<>() ;
        list.add(10);
        list.add(15);

        //way 2 of creating list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);


        LinkedList<Student> StudentLinkedList = new LinkedList<>();
        StudentLinkedList.add(new Student(15));
        StudentLinkedList.add(new Student(17));
        StudentLinkedList.addFirst(new Student(1)); //added in begining
        StudentLinkedList.addLast(new Student(51));

        System.out.println(StudentLinkedList.get(0).age);
        System.out.println(StudentLinkedList.get(1).age);
        System.out.println(StudentLinkedList.get(2).age);
        System.out.println(StudentLinkedList.get(3).age);*/


        //ARRAYLIST vs VECTOR
        List<Integer> vec = new Vector<>();
        Vector<Integer> vec2 = new Vector<>();

        //hashset HashMap

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(15);

        Set<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(15);
        System.out.println(set.equals(set3));


        HashSet<Integer> set2 = new HashSet<>();

        TreeSet<Integer> treeset = new TreeSet<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.offer(15);


    }
}
