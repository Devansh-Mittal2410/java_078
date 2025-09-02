package Unit_1.Exception;

public class ExceptionMain {
    public static void main(String[] args) {
        Exception.Bank_main.ExceptionUserDefined obj = new Exception.Bank_main.ExceptionUserDefined();
        try{
            obj.validate(12);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
