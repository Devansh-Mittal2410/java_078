package Unit_2.MethodRefernce;
@FunctionalInterface
public interface Sayable {
    default void sayMore(){
        System.out.println("Hi, I am Devansh - The God");
    }
    void say();
    static void sum(int x, int y){
        System.out.println(x+y);
    }
}
