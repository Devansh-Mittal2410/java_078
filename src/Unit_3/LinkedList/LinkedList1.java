package Unit_3.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Fourth");
        Iterator it = ll.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ll.remove("Third");
        ll.addFirst("Zero");
        ll.addLast("Fifth");
        System.out.println(ll);
        ll.add(3,"Third");
        System.out.println(ll);
    }
}
