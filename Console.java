import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

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
