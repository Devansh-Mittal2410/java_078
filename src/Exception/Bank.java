package Exception;

public class Bank {
    private int balance = 10000;
    public void withdraw(int amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Cannot withdraw amount greater than Balance");
        }
        else{
            balance = balance-amount;
            System.out.println("Withdrawl Successful");
            System.out.println("Remaining Balance : "+balance);
        }
    }
}
