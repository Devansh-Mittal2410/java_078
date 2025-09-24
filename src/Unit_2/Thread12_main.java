package Unit_2;

public class Thread12_main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
//        System.out.println("P : " + th1.getPriority());
//        th1.setPriority(Thread.MIN_PRIORITY);
//        System.out.println("P : " + th1.getPriority());
        Thread2 th2 = new Thread2();
        th2.start();
//        System.out.println(th1.getName());
//        th1.setName("KIET Thread");
//        System.out.println(th1.getName());
////        Priority |- 1(min)
////                 |- 5(normal)
////                 |- 10(max)
//        System.out.println("P : " + th1.getPriority());
//        th1.setPriority(9);
//        System.out.println("P : " + th1.getPriority());
    }
}
