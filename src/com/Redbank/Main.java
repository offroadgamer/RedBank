package src.com.Redbank;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var myAccount123 = new Account("my Account 123", 1_000);
        System.out.println(NumberFormat.getCurrencyInstance().format(myAccount123.getBalance()));

    }
}
