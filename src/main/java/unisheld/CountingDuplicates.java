//Count the number of Duplicates
//        Write a function that will return the count of distinct case-insensitive alphabetic characters
//        and numeric digits that occur more than once in the input string.
//        The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
//
//        Example
//        "abcde" -> 0 # no characters repeats more than once
//        "aabbcde" -> 2 # 'a' and 'b'
//        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//        "indivisibility" -> 1 # 'i' occurs six times
//        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
//        "aA11" -> 2 # 'a' and '1'
//        "ABBA" -> 2 # 'A' and 'B' each occur twice

package unisheld;

import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String lowerText = text.toLowerCase();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        int duplicateCount = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }
}
