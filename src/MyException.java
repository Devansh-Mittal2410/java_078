import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {
        int x,y,z = 0;
        Scanner sc = new Scanner(System.in);

        try{// used only once
            x = sc.nextInt();
            y = sc.nextInt();
            z = x/y;
            System.out.println("Exception Not Occur");
        }
        catch(ArithmeticException e){//catch can be used multiple times
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println(e);;
        }
        catch (Exception e) { // to be used at last because it covers all exceptions alone.
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Result is "+z);
        }
    }
}
