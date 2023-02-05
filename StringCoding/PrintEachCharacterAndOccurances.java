package StringPrograms;

import java.util.HashMap;

public class PrintEachCharacterAndOccurances {
    public static void main(String[] args) {
        String str = "javajavajavatu";
        findDuplicate(str);

    }

    public static void findDuplicate(String input) {
        char[] ch = input.toCharArray();
        // System.out.println(ch);
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char eachchar : ch) {
            if (hm.get(eachchar) == null) {
                hm.put(eachchar, 1);
            } else {
                hm.put(eachchar, hm.get(eachchar) + 1);
            }
            System.out.println("key: " + eachchar + " :value: " + hm.get(eachchar));
        }

    }
}
