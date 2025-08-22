public class PersonStudent extends Person{
    public String course;

    public PersonStudent(String address, String course) {
        super(address);//calls parent class constructor
        this.course = course;
    }

    public void getCourse(){
        System.out.println("Course is "+course);
    }
}
