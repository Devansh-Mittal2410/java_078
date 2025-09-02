package Unit_1;

public class Student_main {

    public static void main(String[] args) //For student
    {
        Student s1 = new Student(5, "Devansh");
////        Unit_1.Student s2 = new Unit_1.Student();
//        Unit_1.Student s2 = s1;//changes made in s1 will change in s2 also as the reference is passed and not the constructor is copied like in c++.
////        s1.name = "Devansh";
////        s1.roll_no = 5;
//        s1.display();
//        s2.display();
        Student s2 = new Student(s1);
        s2.display();
    }
}
