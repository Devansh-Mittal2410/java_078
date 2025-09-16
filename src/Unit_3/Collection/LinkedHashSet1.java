package Unit_3.Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("One");
        lhs.add("Two");
        lhs.add("Three");
        lhs.add("Two");
        System.out.println(lhs);
    }
}
