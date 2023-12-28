//CodSoft Internship
import java.util.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // Currency() class is used here! To, display the
        // Currency - Codes() of the Respective Countries..//
        Currency C = Currency.getInstance("USD");
        Currency C1 = Currency.getInstance("AUD");
        Currency C2 = Currency.getInstance("CAD");

        String USD = C.getSymbol(); // US Dollar
        String USD_display = C.getDisplayName(); // US Dollar Display_Name()

        String AUD = C1.getSymbol(); // Austrailian Dollar
        String AUD_display = C1.getDisplayName(); // Australian Dollar Display_Name()

        String CAD = C2.getSymbol(); // Canadian Dollar
        String CAD_display = C2.getDisplayName(); // Canadian Dollar Display_Name()
        // String

        System.out.println("1. Rupees (INR)\n2. US Dollar (" + USD + ")\n3. Australian Dollar (" + AUD + ")");
        System.out.println("4. Canadian Dollar (" + CAD + ")"); // \n5. Panama (" + USD + ") ");//

        System.out.println("-======-----------==========\nWelcome To Currency Converter\n-======-----------==========");
        System.out.println("\nKindly, press 0 to Continue...."); // User, has to press 0 to Continue...
        int x = S.nextInt(); // Prompt, User to Select Base Currency

        System.out.println("\n-======-----------======\nEnter Your Amount Here for Conversion: ");
        int amount = S.nextInt(); // Prompt, User to Enter Amount for Conversion...


        if (x == 0) {
            System.out.println("\nSelect Your Base Currency: ");
            int choice = S.nextInt(); // It, only stores the Serial No.. [1,2,3,4 or 5].
            for (int i = 0; i <= choice; i++) {
                if (choice == 1) {
                    System.out.println("Your, Base Currency is Indian [ Rupees ].");
                    break;
                } else if (choice == 2) {
                    System.out.print("Your, Base Currency is " + USD_display + " [" + USD + "].");
                    break;
                } else if (choice == 3) {
                    System.out.print("Your, Base Currency is " + AUD_display + " [" + AUD + "].");
                    break;
                } else if (choice == 4) {
                    System.out.print("Your, Base Currency is " + CAD_display + " [" + CAD + "].");
                    break;
                }
                // else if (choice == 5) {
                // System.out.print("Your, Base Currency is " + USD_display + " [" + USD +
                // "].");
                // int[] base_currency = new int[choice];
                // break;
                // }
                else {
                    System.out.print("Wrong, Input....");
                    break;
                } //
            }
            double usd = 0.01202, aud = 0.01847, cad = 0.01646; // Rupees compared to
            // System.out.print(choice);
            if (choice == 1) { // Other Currency to Indian Rupees
                int i = 0;
                do {
                    // In, Indian
                    System.out.println("\nConverting Currency Value...");
                    double sum = amount * amount - aud;
                    // System.out.println(sum);
                    break;
                } while (i < choice);
            } else if (choice == 2) {
                int i = 0;
                do {
                    // Indian to USD
                    System.out.println("\nConverting Currency Value...");
                    double sum = amount * usd - cad;
                    // System.out.println(sum);
                    break;
                } while (i < choice);
            } else if (choice == 3) {
                int i = 0;
                do {
                    // Indian to AUD
                    System.out.println("\nConverting Currency Value...");
                    double sum = amount * aud - usd;
                    // System.out.println(sum);
                    break;
                } while (i < choice);
            } else if (choice == 4) {
                int i = 0;
                do {
                    // Indian to CAD
                    System.out.println("\nConverting Currency Value...");
                    double sum = amount * cad + aud;
                    // System.out.println(sum);
                    break;
                } while (i < choice);
            }
        } else {
            System.out.print("-======-----------======\nExit...");
            return;
        }

        // Repeatation of Above Code
        System.out.println("\n-======-----------======\nSelect Your Target Currency: ");
        int choice1 = S.nextInt(); // It, only stores the Serial No.. [1,2,3,4 or 5].
        for (int j = 0; j <= choice1; j++) {
            if (choice1 == 1) {
                System.out.println("Your, Targeted Currency is Indian [ Rupees ].");
                break;
            } else if (choice1 == 2) {
                System.out.print("Your, Targeted Currency is " + USD_display + " [" + USD + "].");
                break;
            } else if (choice1 == 3) {
                System.out.print("Your, Targeted Currency is " + AUD_display + " [" + AUD + "].");
                break;
            } else if (choice1 == 4) {
                System.out.print("Your, Targeted Currency is " + CAD_display + " [" + CAD + "].");
                break;
            }
            // else if (choice == 5) {
            // System.out.print("Your, Targeted Currency is " + USD_display + " [" + USD +
            // "].");
            // int[] target_currency = new int[choice];
            // break;
            // }
            else {
                System.out.print("Wrong, Input....");
                break;
            } //
        }
        // System.out.print(choice1);

        double usd = 0.01202, aud = 0.01847, cad = 0.01646; // Rupees compared to
        double usd1 = 83.19, aud1 = 54.13, cad1 = 60.72; // Other currency in Rupees
        // other currency
        if (choice1 == 1) { // Other Currency to Indian Rupees
            int i = 0;
            do {
                // In, indian value
                System.out.println("\nConverting Currency Value...");
                double sum = amount * amount - usd;
                // System.out.println(sum);
                System.out.println("-======-----------======");
                System.out.println("|     The Converted Amount is* ");
                System.out.println("-======-----------======");
                System.out.println("|        " + sum + "          ");
                System.out.println("-======-----------======");
                System.out.println("|    Your Target Currency Symbol is:     ");
                System.out.println("|     Indian Rupees [INR]    ");
                System.out.println("-======-----------======");
                break;
            } while (i < choice1);
        } else if (choice1 == 2) {
            int i = 0;
            do {
                // USD to Indian
                System.out.println("\nConverting Currency Value...");
                double sum = amount * usd1 - aud;
                // System.out.println(sum);
                System.out.println("-======-----------======");
                System.out.println("|     The Converted Amount is* ");
                System.out.println("-======-----------======");
                System.out.println("|        " + sum + "          ");
                System.out.println("-======-----------======");
                System.out.println("|    Your Target Currency Symbol is:     ");
                System.out.println("|     " + USD_display + "[" + USD + "]");
                System.out.println("-======-----------======");
                break;
            } while (i < choice1);
        } else if (choice1 == 3) {
            int i = 0;
            do {
                // AUD to Indian
                System.out.println("\nConverting Currency Value...");
                double sum = amount * aud1 - aud1;
                // System.out.println(sum);
                System.out.println("-======-----------======");
                System.out.println("|     The Converted Amount is* ");
                System.out.println("-======-----------======");
                System.out.println("|        " + sum + "          ");
                System.out.println("-======-----------======");
                System.out.println("|    Your Target Currency Symbol is:     ");
                System.out.println("|     " + AUD_display + "[" + AUD + "]");
                System.out.println("-======-----------======");
                break;
            } while (i < choice1);
        } else if (choice1 == 4) {
            int i = 0;
            do {
                // CAD to Indian
                System.out.println("\nConverting Currency Value...");
                double sum = amount * cad1 -cad;
                // System.out.println(sum);
                System.out.println("-======-----------======");
                System.out.println("|     The Converted Amount is* ");
                System.out.println("-======-----------======");
                System.out.println("|        " + sum + "          ");
                System.out.println("-======-----------======");
                System.out.println("|    Your Target Currency Symbol is:     ");
                System.out.println("|     " + CAD_display + "[" + CAD + "]");
                System.out.println("-======-----------======");
                break;
            } while (i < choice1);
        }

    }
}
