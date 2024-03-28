package Inputers;

import java.util.Scanner;

public class ConsoleInputer {
    private String title;

    public ConsoleInputer(String title) {
        this.title = title;
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(title + " " + message + ": ");
        return in.nextLine();
    }
}
