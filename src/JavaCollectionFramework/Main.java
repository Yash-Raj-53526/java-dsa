package JavaCollectionFramework;

import java.net.SocketTimeoutException;
import java.util.*;
import javax.swing.AbstractAction;

public class Main {
    public static void main(String[] args) { // This method has a constructor name
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(20);
        list.add(78);
        list.add(40);
        list.add(12);
        System.out.println(list);
        list.add(25);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("list.size(): " + list.size());

        // Iterating through the list
        System.out.println("Iterating through the list using for loop");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("array list: " + list);
        Collections.sort(list);
        System.out.println("sorted list: " + list);
        Collections.reverse(list);
        System.out.println("reversed list: " + list);
        // ArrayList<Integer> clonedList = (ArrayList<Integer>) list.clone();
        // System.out.println("cloned list: " + clonedList);

        System.out.println("--------------------------------");

        // LinkedList -- collection of nodes, each node contains data and a reference to
        // the next node
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Apple");
        ll.add("Banana");
        ll.add("Mango");
        System.out.println("linked list: " + ll);
        ll.addFirst("Grapes");
        System.out.println(ll);
        ll.addLast("Pineapple");
        System.out.println(ll);

        // Iterating through the linked list
        Iterator<String> it1 = ll.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("--------------------------------");

        // vector -- dynamic array, similar to ArrayList but synchronized means
        // thread-safe i'e multiple threads can access it at the same time without any
        // issues
        Vector<Double> v = new Vector<>();
        v.add(12.5);
        v.add(15.5);
        v.add(20.5);
        System.out.println("vector v: " + v);

        System.out.println("--------------------------------");

        // Stack -- LIFO (Last In First Out) data structure, used to store data in a
        // linear order, used in function calls, undo operations, etc.
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("stack: " + stack);
        stack.push("D");
        System.out.println("pushed D: " + stack);
        stack.pop();
        System.out.println("popped: " + stack);
        stack.peek();
        System.out.println("peek: " + stack.peek());
        System.out.println("search B: " + stack.search("B"));
        System.out.println("empty: " + stack.empty());
        stack.clear();
        System.out.println("cleared stack: " + stack);

        // Iterating through the stack
        Iterator<String> it2 = stack.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("--------------------------------");

        // Queue -- FIFO (First In First Out) data structure, used to store data in a
        // linear order, used in function calls, print jobs, etc.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(90);
        queue.offer(23);
        queue.offer(923);
        queue.offer(456);
        queue.offer(2);
        System.out.println("queue: " + queue);

        System.out.println("peeking " + queue.peek());

        System.out.println("Removing " + queue.poll());

        System.out.println(queue);
        System.out.println("-------------------------------------------");

        // ArrayDeque
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.offer("Yash");
        dq.offer("Tripti");
        dq.offer("Shubh");
        dq.offer("Plant");
        System.out.println("ArrayDeque: " + dq);
        // System.out.println("Peek: "+ dq.peek());
        // System.out.println("Poll: " + dq.poll());
        System.out.println("Itrating :- ");
        // itration
        // Iterator<String> IT = dq.iterator();
        // while(IT.hasNext()){
        // System.out.println(IT.next());
        // }

        for (String name : dq) {
            System.out.println(name);
        }

        System.out.println("-----------------------------------------------");

        Set<String> set = new HashSet<>();
        set.add("Yash");
        set.add("Shubh");
        set.add("Tree");
        set.add("Plant");
        set.add("Water");
        System.out.println("Set: " + set);

        HashSet<Student> set2 = new HashSet<>();
        Student s1 = new Student("Yash", 39, "A", 19);
        Student s2 = new Student("Tripti", 37, "A", 18);
        Student s3 = new Student("Satkirat", 27, "A", 18);
        Student s4 = new Student("Farhan", 18, "A", 18);
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);

        System.out.println("Set of Students : " + set2);
    }
}
