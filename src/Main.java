//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank bank1 = new Bank();
        ATM atm1 = new ATM(bank1);
        atm1.start();
    }
}