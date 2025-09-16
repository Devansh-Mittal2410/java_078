package Unit_3.Collection;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of hs1 : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of elements of hs2 : ");
        int m = sc.nextInt();
        System.out.println("Enter the elements in hs1 : ");
        for (int i = 0; i < n; i++) {
            hs1.add(sc.next());
        }
        System.out.println(hs1);
        System.out.println("Enter the elements in hs2 : ");
        for (int i = 0; i < m; i++) {
            hs2.add(sc.next());
        }
        System.out.println(hs2);

        System.out.println("Intersection of both sets : ");
        hs2.remove(hs1);
        System.out.println(hs1);
        hs1.removeIf(str->str.contains("a"));
        System.out.println(hs1);

        System.out.println("Union of both sets : ");
        hs1.addAll(hs2);
        System.out.println(hs1);
    }
}
