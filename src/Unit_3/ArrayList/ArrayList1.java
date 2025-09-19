package Unit_3.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(34);
        al.add(51);
//        System.out.println(al);
        for(int i:al){
            System.out.println(i);
        }


    }
}
