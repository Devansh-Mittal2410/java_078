//package Unit_1.Exception;
//
//public class Bank_main {
//    public static void main(String[] args) {
//        Bank b = new Bank();
//        try {
//            b.withdraw(1200);
//        }
//        catch(RuntimeException e){
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static class ExceptionUserDefined {
//        public void validate(int age) throws InvalidAgeException
//        {
//            if (age<18)
//                throw new InvalidAgeException("Cannot cast vote,Age less than 18");
//            else
//                System.out.println("Eligible to vote");
//        }
//    }
//}
