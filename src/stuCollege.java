public class stuCollege extends stu{
    public stuCollege(String name, int roll_no) {
        super(name, roll_no);
    }
    public void attend_class()
    {
        System.out.println(name+" attend class on smart board.");
    }
    public void give_exam()
    {
        System.out.println(roll_no+" give exam in online mode");
    }
}