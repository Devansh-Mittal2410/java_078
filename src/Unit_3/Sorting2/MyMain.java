package Unit_3.Sorting2;

import java.util.ArrayList;
import java.util.Collections;

public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(12,"abc",100));
        arr.add(new Student(300,"rav",104));
        arr.add(new Student(51,"usd",98));
        arr.add(new Student(21,"wef",110));
        arr.add(new Student(23,"asc",86));
        arr.add(new Student(11,"jhf",31));
        Collections.sort(arr);
        for (Student st : arr) {
            System.out.println("Name : " + st.name + " ,Age : " + st.age + " ,Roll no. : " + st.roll_no);
        }
    }
}
