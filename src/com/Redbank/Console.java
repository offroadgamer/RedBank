package src.com.Redbank;

import java.util.Scanner;

public class Console {

    private Account account;

    private static Scanner scanner = new Scanner(System.in);

    public void console() {
        System.out.print("> ");
        while (true) {
            switch (scanner.nextLine()) {
                case "exit":
                    break;
                case "deposit":
                    deposit();
                case "withdraw":
                    withdraw();
            }
            if (scanner.nextLine().equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    private void deposit() {
        System.out.println("How much do you want to deposit?");
        System.out.print("> ");
        double amountToDeposit = scanner.nextDouble();
    }

    private void withdraw() {

    }

    public String getString() {
        System.out.print("> ");
        return scanner.nextLine();
    }

    public double getNumber() {
        double number = 0;
        System.out.print("> ");
        while (true) {
            boolean test;
            try {
                number = Double.parseDouble(scanner.nextLine());
                test = true;
            } catch (NumberFormatException e) {
                test = false;
            }
            if (test) {
                break;
            }
            System.out.println("The input must be a numeric value!");
            System.out.print("> ");
        }
        return number;
    }
}
