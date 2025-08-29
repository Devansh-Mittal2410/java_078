public class ExceptionMain {
    public static void main(String[] args) {
        ExceptionUserDefined obj = new ExceptionUserDefined();
        try{
            obj.validate(12);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
