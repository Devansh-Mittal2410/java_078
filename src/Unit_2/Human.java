package Unit_2;

public sealed class Human permits Manish, Vartika, Anjali{
    public void printName(){
        System.out.println("Default");
    }
}
