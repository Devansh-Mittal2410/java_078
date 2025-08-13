public class Employee {
    int id;
    String name;
    Employee(int i,String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(" Id "+id+" Name "+name);
    }
}
