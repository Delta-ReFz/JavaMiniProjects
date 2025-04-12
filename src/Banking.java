import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Étape 1 DECLARE VARIABLES
        //Étape 2 DISPLAY MENU
        //Étape3 GET AND PROCESS USER CHOICE
        //Étape4 showBalance()
        //Étape5 deposit()
        //Étape6 withdraw()
        //Étape7 EXIT MESSAGE

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show your balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID INPUT");
            }
        }

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n",balance);
    }

    static double deposit() {

        double amount;

        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("INVALID INPUT");
            return 0;
        }
        else {
            return amount;
        }
    }

    static double withdraw(double balance) {

        double amount2;

        System.out.print("Enter amount to withdraw: ");
        amount2 = scanner.nextDouble();

        if(amount2 > balance) {
            System.out.println("Not enough money");
            return 0;
        }
        else if (amount2 < 0) {
            System.out.println("INVALID INPUT");
            return 0;
        }
        else {
            return amount2;
        }
    }



}
