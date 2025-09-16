package Unit_3.Collection;

import java.util.TreeSet;

public class treeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Hello");
        ts.add("Good");
        ts.add("Morning");
        ts.add("Hello");
        System.out.println(ts);
    }
}
