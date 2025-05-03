import java.util.Scanner;

public class ATM {
    private Bank bank;
    private Account currentAccount;
    private Scanner scanner = new Scanner(System.in);

    public ATM(Bank bank){
        this.bank = bank;
    }

    public void start(){
        System.out.println("Welcome to the AKM Bank!");
        if(login()){
            showMenu();
        }
        System.out.println("Login to start.");
    }

    public boolean login(){
        System.out.print("Enter your account Number: ");
        String accountNum = scanner.nextLine();
        System.out.print("Enter your pin: ");
        String pin = scanner.nextLine();

        currentAccount = bank.authenticate(accountNum, pin);
        if(currentAccount != null){
            return true;
        }return false;
    }

    public void showMenu(){
        int choice;
        do {
            System.out.println("\n1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.print("Choose an option: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1: checkBalance(); break;
                case 2: withdraw();break;
                case 3: deposit();break;
                case 4: System.out.println("Exiting....");
            }
        }while(choice !=4 );
    }

    public void checkBalance(){
        System.out.println("Your Balance is: "+ currentAccount.getBalance());
    }

    public void withdraw(){
        System.out.print("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if(currentAccount.withdraw(amount)){

            System.out.println("Operation successful. Please take your money");
        }else{
            System.out.println("Insufficient funds or incorrect format");
        }

    }

    public void deposit(){
        System.out.print("Enter amount to deposit: ");
        Double amount = Double.parseDouble(scanner.nextLine());
        if(currentAccount.deposit(amount)){
            System.out.println("You have successfully deposited: "+amount);
        }else{
            System.out.println("Enter a correct figure.");
        }

    }
}