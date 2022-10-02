package String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            Split.split(input);
            String rez = Split.split(input);
            if (rez.length() < 40) {
                System.out.println(String.format("\"%s\"", rez));
            } else {
                System.out.println(String.format("\"%s\"", rez.substring(0, 40) + "..."));
            }
        }

    }
}
