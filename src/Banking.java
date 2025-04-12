import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {

        //Étape 1 DECLARE VARIABLES
        //Étape 2 DISPLAY MENU
        //Étape3 GET AND PROCESS USER CHOICE
        //Étape4 showBalance()
        //Étape5 deposit()
        //Étape6 withdraw()
        //Étape7 EXIT MESSAGE

        Scanner scanner = new Scanner(System.in);

        double balance;
        boolean isRunning = true;
        int choice;

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.out.println("1. Show your balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");
        


        scanner.close();

    }
}
