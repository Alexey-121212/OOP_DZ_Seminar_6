package Inputers;

import java.util.Scanner;

public class ConsoleInputer {
    public ConsoleInputer() {
    }
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
