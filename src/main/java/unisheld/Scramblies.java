//Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
//
//        Notes:
//
//        Only lower case letters will be used (a-z). No punctuation or digits will be included.
//        Performance needs to be considered.
//        Examples
//        scramble('rkqodlw', 'world') ==> True
//        scramble('cedewaraaossoqqyt', 'codewars') ==> True
//        scramble('katas', 'steak') ==> False

package unisheld;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) - 'a';
            if (charCount[index] == 0) {
                return false;
            }
            charCount[index]--;
        }

        return true;
    }

}
