public class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double balance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    //getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public boolean validatePin(String inputPin){
        if(pin.equals(inputPin)){
            return true;
        }return false;
    }

    public void checkBalance(){
        System.out.println("Your balance is: "+getBalance());
    }

    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }return false;
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        }return false;
    }
}
