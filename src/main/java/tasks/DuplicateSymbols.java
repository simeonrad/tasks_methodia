package tasks;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateSymbols {
    public static void main(String[] args) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String testOne = scanner.nextLine();
        //String testOne = "This is a new String and has some symbols that are occurring more than once!";

        for (int i = 0; i < testOne.length(); i++) {
            if (hashMap.containsKey(testOne.charAt(i))) {
                int value = hashMap.get(testOne.charAt(i));
                hashMap.replace(testOne.charAt(i), value+1);
                continue;
            }
            hashMap.put(testOne.charAt(i), 1);
        }


        System.out.println("Duplicate characters and their counts:");
        for (HashMap.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");
            }
        }

    }
}
