package Unit_2.FunctionalInterface;

public class FI1_main {
    public static void main(String[] args) {
        FI1 isEven = (int n) -> n%2==0;
        System.out.println(isEven.test(17));
    }
}
