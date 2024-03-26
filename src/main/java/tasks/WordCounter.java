package tasks;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "This is a test string with several words, some of which repeat words and some do not.";

        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = text.split("\\s+");

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        int totalWords = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                totalWords++;
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total words in the string: " + totalWords);

    }
}
