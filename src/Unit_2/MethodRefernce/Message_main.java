package Unit_2.MethodRefernce;


//Constructor Reference
public class Message_main {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
