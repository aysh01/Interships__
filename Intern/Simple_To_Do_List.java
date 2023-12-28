
// Build a program that allows users to add, remove, and view items on a to-do list.
// Simple - To Do - List App
import java.util.*;

class simple {
    void simple() {
        System.out.println(
                "-======-----------======\n Welcome, To Our World Famous Simple - To - Do List App..\n-======-----------======");
    }
}

class add extends simple {
    static int value;

    void display() { // Add Items in the List
        System.out.println("1. Add ..");
        // display();
    }

    void value(int x) {
        this.value = x;
    }
}

class remove extends add { // Remove Items from the List
    void remove() {
        System.out.println("2. Remove ..");
    }
}

class view extends remove { // View Items in the List
    void view() {
        System.out.println("3. View ..");
    }
}

class Simple_To_Do_List extends view {
    private static int add;
    private static int j;

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Simple_To_Do_List sim = new Simple_To_Do_List();

        sim.simple();
        System.out.println("What Would You Like To Do...?");
        sim.display(); // 1. Add Items in the List
        sim.remove(); // 2. Remove Items from the List
        sim.view(); // 3. View Items in the List

        int n = 10;
        for (int i = 0; i < n; i++) {
            int[] list = new int[100]; // list[] array to store the balance amount..

            System.out.println("Add, Remove or View Items ?");
            String input = S.next(); // Select Operation

            if (input.equals("add")) {
                for (int j = 0; j < 1; j++) {
                    System.out.println("Your Input..");
                    int add = S.nextInt();
                    list[j] = add; // add() User Input
                    break;
                }
                continue;
            }
            // else if (input == "remove") {
            // result[i] = amount;
            // balance -= amount;

            // continue;
            // }
            else if (input.equals("view")) {
                for (int j = 0; j < 1; j++) {
                    System.out.println("Your Input..");
                    // int add = S.nextInt();
                    int x = list[j] + add;
                    System.out.println(x);
                    break;
                }
                continue;
            } else {
                System.out.println("Wrong - Input");
                System.out.println("TRY AGAIN..");
                break;
            }
        }
        System.out.println("Thanks, For Using Our App...");
    }
}