package Unit_3;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key and value : ");
            String key = sc.next();
            int value = sc.nextInt();
            hm.put(key, value);
        }
        System.out.println("Elements of hash map : ");
        for(String k : hm.keySet()){
            System.out.println(k + " " + hm.get(k));
        }
    }
}
