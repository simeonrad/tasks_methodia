package tasks;

import java.util.ArrayList;

public class ArrayListTraverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello!");
        arrayList.add("Nice to see you!");
        arrayList.add("How are you?");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}