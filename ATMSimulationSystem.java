import java.util.Scanner;

class ATMSimulationSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int enteredPin;
        double balance = 10000.0;
        int choice;
        double amount;

        System.out.println("===== ATM SIMULATION SYSTEM =====");

        System.out.print("Enter ATM PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == pin) {

            do {
                System.out.println("\n----- ATM MENU -----");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        amount = sc.nextDouble();
                        balance = balance + amount;
                        System.out.println("Deposit Successful.");
                        System.out.println("Updated Balance: ₹" + balance);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        amount = sc.nextDouble();

                        if (amount <= balance) {
                            balance = balance - amount;
                            System.out.println("Withdrawal Successful.");
                            System.out.println("Remaining Balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect PIN! Access Denied.");
        }

        sc.close();
    }
}