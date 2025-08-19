public class Student
{
    int roll_no; //Data-member
    String name; //Data-member
    Student() //Default Constructor
    {
        System.out.println("I am default constructor");
    }
    Student(int r, String n) //Constructor
    {
        roll_no = r;
        name = n;
    }
    Student(Student s){
        roll_no = s.roll_no;
        name = s.name;
    }
    public void display(){
        System.out.println("Roll no. "+roll_no+" Name "+name);
    }
}
