package Unit_3;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(3, 5);
        vec.add("First");
        vec.add("2nd");
        vec.add("3rd");
        vec.add("4rd");

        System.out.println(vec.capacity());
        System.out.println(vec.size());
    }
}
