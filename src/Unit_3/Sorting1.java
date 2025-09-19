package Unit_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(21);
        arr.add(0);
        arr.add(-12);
        arr.add(1);
        Collections.sort(arr);// ascending order
        System.out.println(arr);
        Collections.sort(arr, Comparator.reverseOrder());// descending order
        System.out.println(arr);
    }
}
