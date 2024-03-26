package tasks;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder inputTransform = new StringBuilder(input);
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(inputTransform.charAt(i));
        }

        System.out.println(output);
    }
}
