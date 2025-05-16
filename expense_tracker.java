package mini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Expense {
    private final String description;
    private final double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

public class ExpenseTracker {
    private final List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String description, double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return;
        }
        expenses.add(new Expense(description, amount));
        System.out.println("Expense added successfully!");
    }

    public void deleteExpense(int index) {
        if (index >= 0 && index < expenses.size()) {
            expenses.remove(index);
            System.out.println("Expense deleted successfully!");
        } else {
            System.out.println("Invalid expense number!");
        }
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        System.out.println("Expenses:");
        for (int i = 0; i < expenses.size(); i++) {
            Expense expense = expenses.get(i);
            System.out.printf("%d. %s: $%.2f%n", (i + 1), expense.getDescription(), expense.getAmount());
        }
    }

    public void summary() {
        double total = expenses.stream().mapToDouble(Expense::getAmount).sum();
        System.out.printf("Total Expenses: $%.2f%n", total);
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\nEnter command (add, delete, view, summary, exit): ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter description(food,travel,shopping,etc): ");
                    String description = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        tracker.addExpense(description, amount);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount. Please enter a valid number.");
                    }
                    break;
                case "delete":
                    System.out.print("Enter expense number to delete: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        tracker.deleteExpense(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid expense number.");
                    }
                    break;
                case "view":
                    tracker.viewExpenses();
                    break;
                case "summary":
                    tracker.summary();
                    break;
                case "exit":
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
