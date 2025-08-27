import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) throws IOException {
        int x,y,z = 0;
        DataInputStream dis = new DataInputStream(System.in);

        x = dis.readInt();
        y = dis.readInt();
        z = x/y;
        System.out.println("Exception Not Occur");
        System.out.println("Result is "+z);

//        Scanner sc = new Scanner(System.in);

//        try{// used only once
//            x = dis.readInt();
//            y = dis.readInt();
//            z = x/y;
//            System.out.println("Exception Not Occur");
//        }
//        catch(ArithmeticException e){//catch can be used multiple times
//            System.out.println(e.getMessage());
//        }
//        catch (InputMismatchException e) {
//            System.out.println(e);;
//        }
//        catch (Exception e) { // to be used at last because it covers all exceptions alone.
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Result is "+z);
//        }
    }
}
