package Exception;

public class Bank_main {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(1200);
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
