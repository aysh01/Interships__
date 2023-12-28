//ATM Interface
import java.util.*;

class ATM {
    void history() {
        System.out.println("-======-----------======\n Your, Transaction History..\n-======-----------======");
    }
}

class transaction extends ATM {
    static int amount, balance = 10000, sum;
    // Balance = 10K

    void display() { // Transaction History
        System.out.println("1. Transaction History ..");
        // display();
    }

    void amount(int x) {
        this.amount = x;
    }
}

class Withdraw extends transaction { // Withdraw
    void withdraw() {
        System.out.println("2. Withdraw ..");
    }
}

class Deposit extends Withdraw {
    void deposit() {
        System.out.println("3. Deposit ..");
    }
}

class Transfer extends Deposit {
    static int sender_bank, receiver_bank;

    void transfer() {
        System.out.println("4. Transfer ..");
    }

    void sender_bank(int x) {
        this.sender_bank = x;
    }

    void receiver_bank(int x) {
        this.receiver_bank = x;
    }
}

class Quit extends Transfer {
    void quit() {
        System.out.println("5. Quit ..");
    }
}

class Atm_interface extends Quit {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner S = new Scanner(System.in);

        Atm_interface atm = new Atm_interface();
        // atm.display(); // To, display transaction history...
        System.out.println("Enter Your User ID: ");
        String User_ID = S.next(); // User - ID

        System.out.println(" \nEnter Your PIN: ");
        String PIN = S.next(); // User PIN

        if (User_ID == User_ID || PIN == PIN) {
            System.out.println(
                    "-======-----------======\nWelcome, to Secure ATM Interface....\n-======-----------======");
            System.out.println("Which of The Following Operation, Would You Like To Perform...");
            atm.display(); // 1. Transaction
            atm.withdraw(); // 2. Withdraw
            atm.deposit(); // 3. Deposit
            atm.transfer(); // 4. Transfer
            atm.quit(); // 5. Quit

            int z = 5; // Multiple, Execution of Opetations
            for (int i = 0; i < z; i++) {
                int[] result = new int[100]; // result[] array to store the balance amount.. (e.g: 10000-500)
                // therefore, (9,500) will be stored inside result array..

                int[] transaction_history = new int[100]; // transaction_history[] array to store the amount
                // withdrawal request..

                System.out.println("Select * Operation");
                int choice = S.nextInt(); // Select Operation

                if (choice == 1) {
                    atm.history();
                    for (int j = 0; j < i; j++) {
                        transaction_history[j] = balance;
                        System.out.println(transaction_history[j]);
                        break;
                    }
                    continue;
                } else if (choice == 2) {
                    System.out.println("Enter Your Amount, for Withdrawal: ");
                    atm.amount(S.nextInt());
                    result[i] = amount;
                    balance -= amount;
                    // sum = balance - amount;

                    System.out.println("Your, Cash of Rs. [" + amount + "] is dispensed..");
                    continue;
                } else if (choice == 3) {
                    System.out.println("Enter The Amount, You want to Deposit: ");
                    atm.amount(S.nextInt());
                    result[i] = amount;
                    balance += amount;
                    // sum = balance + amount;

                    System.out.println("Your, Cash of Rs. [" + amount + "] is deposited..");
                    continue;
                } else if (choice == 4) {
                    System.out.println("Enter The Amount, You want to Transfer: ");
                    atm.amount(S.nextInt());

                    System.out.println("Enter 1 to Select * Your Bank A/c");
                    atm.sender_bank(S.nextInt()); // Sender Bank A/c
                    int random_Number = rd.nextInt(10000);
                    System.out.println("You, have Selected Your Bank A/c xxx" + random_Number + ".");

                    System.out.println("Enter 2 to Select * Others Bank A/c ");
                    atm.receiver_bank(S.nextInt()); // Receiver Bank A/c
                    int random_Number1 = rd.nextInt(10000);
                    System.out.println("You, have Selected Other Bank A/c xxx" + random_Number1 + ".");
                    // break;
                    System.out.println(
                            "-======-----------======\n Congrats, Rs. of [" + amount
                                    + "] is been credited to Other Bank A/c xxx" + random_Number1
                                    + "...\n-======-----------======");
                    result[i] = amount;
                    balance -= amount;
                    
                    continue;
                } else {
                    System.out.println("You, Chose to Quit..");
                    System.out.println("Are, You Sure ? Y/N");
                    String input = S.next();
                    if (input.equalsIgnoreCase("Y")) {
                        System.out.println(
                                "-======-----------======\nThanks, For Using Secure ATM Interface....\n-======-----------======");
                        break;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println("Your, Session is expired...");
        }
    }
}