//Move the first letter of each word to the end of it,
// then add "ay" to the end of the word. Leave punctuation marks untouched.
//
//        Examples
//        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//        pigIt('Hello world !');     // elloHay orldway !

package unisheld;

public class PigLatin {
    public static String pigIt(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.matches("[a-zA-Z]+")) {
                char firstLetter = word.charAt(0);
                result.append(word.substring(1)).append(firstLetter).append("ay");
            } else {
                result.append(word);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
