package Unit_2.MethodRefernce;

public class SayableMethodR {
//    public static void saySomething() {
//        System.out.println("Hello Static method");
//    }

    public void saySomething() {
        System.out.println("Hello Static method");
    }


//    public static void main(String[] args) {
//        Sayable sayable = SayableMethodR::saySomething;
//        sayable.say();
//    }

    public static void main(String[] args) {
        SayableMethodR methodR = new SayableMethodR();
        Sayable sayable = methodR::saySomething;
        sayable.say();
    }
}
